package com.chauhansoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chauhansoft.dao.StudentDao;
import com.chauhansoft.model.Student;

@Controller
public class StudentController {


    @Autowired
    private StudentDao dao;


    @RequestMapping("/")
    public String homePage() {
        return "home";
    }

    @RequestMapping("/getAllStudent")
    public String getAllStudent(Student student, Model model) {
//		studentDao.save();
        return "home";
    }
}
