package com.chauhansoft.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chauhansoft.model.Employee;
import com.chauhansoft.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @RequestMapping("/")
    public String homePage() {
        return "index";
    }

    @RequestMapping("/register")
    public String registerPage() {
        return "register";
    }


    @RequestMapping("/registerEmployee")
    public String registerEmployee(Employee employee, Model model) {
        employeeServiceImpl.save(employee);
        //if (!list.isEmpty()) {
        //model.addAttribute("data",list);
        model.addAttribute("msg", "<h4 style='color:green;'>Employee Records saved succeccfully....</h4>");
        //} else {
        //	model.addAttribute("msg","<h4 style='color:red;'>Employee Records not saved.</h4>");
        //}
        return "register";
    }

    @RequestMapping("/display")
    public String loadDisplay(Model model) {
        List list = employeeServiceImpl.findAll();
        if (!list.isEmpty()) {
            model.addAttribute("data", list);
        } else {
            model.addAttribute("msg", "<h4 style='color:red;'>There is no Employee.</h4>");
        }
        return "display";
    }

    @RequestMapping("/update")
    public String updateEmployee(Employee employee, Model model) {
        employeeServiceImpl.findByEmployeeId(employee.getEmployeeId());
        Employee e = employeeServiceImpl.save(employee);
        List list = employeeServiceImpl.findAll();
        if (!list.isEmpty()) {
            model.addAttribute("data", list);
            model.addAttribute("msg", "<h4 style='color:green;'>Employee updated successfully....</h4>");
        } else {
            model.addAttribute("msg", "<h4 style='color:red;'>Employee not updated.</h4>");
        }

        return "display";
    }

    @RequestMapping("/delete")
    public String deleteEmployee(Employee employee, Model model) {

        employeeServiceImpl.deleteByEmployeeId(employee.getEmployeeId());
        List list = employeeServiceImpl.findAll();
        if (!list.isEmpty()) {
            model.addAttribute("data", list);
            model.addAttribute("msg", "<h4 style='color:green;'>Employee deleted successfully....</h4>");
        } else {
            model.addAttribute("msg", "<h4 style='color:red;'>Employee not deleted.</h4>");
        }

        return "display";
    }

    @RequestMapping("/searchPage")
    public String searchPage() {
        return "search";
    }

    @RequestMapping("/searchEmployee")
    public String searchEmployee(Employee employee, Model model, HttpServletRequest request) {
        List<Employee> list = new ArrayList<Employee>();
        if (!employee.getEmployeeId().isEmpty()) {
            list = employeeServiceImpl.findByEmployeeId(employee.getEmployeeId());
        } else if (!employee.getEmployeeName().isEmpty()) {
            list = employeeServiceImpl.findByEmployeeName(employee.getEmployeeName());
        } else if (!employee.getEmail().isEmpty()) {
            list = employeeServiceImpl.findByEmail(employee.getEmail());
        } else if (!employee.getAddress().isEmpty()) {
            list = employeeServiceImpl.findByAddress(employee.getAddress());
        }

        if (!list.isEmpty()) {
            model.addAttribute("data", list);
            if ("update".equals(request.getParameter("update"))) {
                model.addAttribute("msg", "<h4 style='color:green;'>Employee updated successfully....</h4>");
            }
            if ("delete".equals(request.getParameter("delete"))) {
                model.addAttribute("msg", "<h4 style='color:green;'>Employee deleted successfully....</h4>");
            }

        } else {
            if ("update".equals(request.getParameter("update"))) {
                model.addAttribute("msg", "<h4 style='color:red;'>Employee not updated.</h4>");
            }
            if ("delete".equals(request.getParameter("delete"))) {
                model.addAttribute("msg", "<h4 style='color:red;'>Employee not deleted.</h4>");
            }

            model.addAttribute("msg", "<h4 style='color:red;'>There is no Employee.</h4>");

        }
        return "search";
    }


}
