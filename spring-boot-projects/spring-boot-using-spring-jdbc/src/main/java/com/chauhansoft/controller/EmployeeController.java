package com.chauhansoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chauhansoft.model.Employee;
import com.chauhansoft.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String indexPage() {
        return "index";
    }

    @RequestMapping("/register")
    public String loadRegisterPage() {
        return "register";
    }

    @RequestMapping("/registerEmployee")
    public String registerEmployee(Employee employee, Model model) {
        int flag = employeeService.insertEmployee(employee);
        if (flag != 0) {
            model.addAttribute("msg", "<h5 style='color:green;'>" + flag + " Record(s) inserted.</h5>");
            return "register";
        } else {
            model.addAttribute("msg", "<h5 style='color:red;'>No record(s) inserted.</h5>");
            return "register";
        }
    }

    @RequestMapping("/listEmployee")
    public String listAllEmployee(Model model) {

        List list = employeeService.getAllEmployee();
        if (!list.isEmpty()) {
            model.addAttribute("data", list);
            return "display";
        } else {
            model.addAttribute("msg", "<h5 style='color:red;'>There is no Employee record(s).</h5>");
            return "display";
        }
    }

    @RequestMapping("/updateEmployee")
    public String updateEmployee(Employee employee, Model model) {
//		System.out.println(employee.getEmployeeName());
        List list = employeeService.updateEmployee(employee);
        if (!list.isEmpty()) {
            model.addAttribute("data", list);
            model.addAttribute("msg", "<h5 style='color:green;'>Employee record(s) has updated.</h5>");
            return "display";
        } else {
            model.addAttribute("msg", "<h5 style='color:red;'>There is no Employee record(s).</h5>");
            return "display";
        }
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(Employee employee, Model model) {

        List list = employeeService.deleteEmployee(employee);
        if (!list.isEmpty()) {
            model.addAttribute("data", list);
            model.addAttribute("msg", "<h5 style='color:green;'>Employee record(s) has deleted.</h5>");
            return "display";
        } else {
            model.addAttribute("msg", "<h5 style='color:red;'>Employee not deleted.</h5>");
            return "display";
        }
    }

    @RequestMapping("/searchPage")
    public String searchPage() {

        return "search";
    }

    @RequestMapping("/searchEmployee")
    public String searchEmployee(Employee employee, Model model) {
        System.out.println(employee.getEmployeeId());
        List list = employeeService.searchEmployee(employee);
        if (!list.isEmpty()) {
            model.addAttribute("data", list);
            return "search";
        } else {
            model.addAttribute("msg", "<h5 style='color:red;'>Employee not found.</h5>");
            return "search";
        }
    }
}
