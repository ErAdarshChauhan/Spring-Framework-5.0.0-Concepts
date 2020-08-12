package com.chauhansoft.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @RequestMapping("/insertEmployee")
    public String insertPage(Employee employee, Model model) {
        Employee e = employeeServiceImpl.save(employee);
        if (e != null) {
            model.addAttribute("msg", "Record saved successfully....");
            return "register";
        } else {
            model.addAttribute("msg", "Record not saved.");
            return "register";
        }
    }

    @RequestMapping("/display")
    public String displayPage(Model model) {

        List list = employeeServiceImpl.findAll();
        if (!list.isEmpty()) {
            model.addAttribute("data", list);
            model.addAttribute("countRow", employeeServiceImpl.count());
            return "display";
        } else {
            model.addAttribute("msg", "<h4 style='color:red;'>There is no any Employee...</h4>");
            return "display";
        }
    }

    @RequestMapping("/update")
    public String updateEmployee(Employee employee, Model model) {

        employeeServiceImpl.findById(employee.getEmployeeId());
        Employee e = employeeServiceImpl.save(employee);
        if (e != null) {
            model.addAttribute("data", employeeServiceImpl.findAll());
            model.addAttribute("countRow", employeeServiceImpl.count());
            model.addAttribute("msg", "<h4 style='color:green;'>Record update successfully....</h4>");
            return "display";
        } else {
            model.addAttribute("msg", "<h4 style='color:red;'>Record not updated.</h4>");
            return "display";
        }
    }

    @RequestMapping("/delete")
    public String delete(Employee employee, Model model) {
        employeeServiceImpl.deleteById(employee.getEmployeeId());

        model.addAttribute("data", employeeServiceImpl.findAll());
        model.addAttribute("countRow", employeeServiceImpl.count());
        model.addAttribute("msg", "<h4 style='color:green;'>Record deleted successfully....</h4>");
        return "display";

    }

    @RequestMapping("/searchPage")
    public String searchPage() {
        return "search";
    }

    @RequestMapping("/searchEmployee")
    public String searchEmployee(Employee employee, Model model) {
        List<Employee> list = new ArrayList<Employee>();
        if (employee.getEmployeeId() != null) {

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
        } else {
            model.addAttribute("msg", "<h4 style='color:red;'>Ooops there is no records.</h4>");
        }
        return "search";


    }
}
