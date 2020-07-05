package org.chauhansoft.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.chauhansoft.dao.StudentDao;
import org.chauhansoft.model.Student;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

	private AbstractApplicationContext container;
	@RequestMapping("/home")
	public String loadHomePage() {
		return "redirect:/";
	}
	
	@RequestMapping(value = "/register")
	public String loadRegisterPage(Model model) {
		container = new ClassPathXmlApplicationContext("SpringBean.xml");
		Student student = container.getBean("student",Student.class);
		model.addAttribute("studentBean", student);
		displayStudent(student,model);
		return "register";
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public String addStudent(@Valid @ModelAttribute("studentBean")Student stud, Model model,BindingResult br) {
		if (br.hasErrors()) {
			return "register";
		} else {
			container = new ClassPathXmlApplicationContext("SpringBean.xml");
			StudentDao dao = container.getBean("studentDao", StudentDao.class);
			dao.insertStudent(stud);
			displayStudent(stud,model);
			model.addAttribute("msg", "Student inserted successfully.......");
			return "register";
		}
			
	}
	
	public String displayStudent(Student stud, Model model) {
		container = new ClassPathXmlApplicationContext("SpringBean.xml");
		StudentDao dao = container.getBean("studentDao", StudentDao.class);
		List list = dao.displayAllStudent(stud);
		model.addAttribute("data", list);
		
		return "register";
	}
	
	@RequestMapping(value = "/search")
	public String searchStudent(Model model) {
		container = new ClassPathXmlApplicationContext("SpringBean.xml");
		Student student = container.getBean("student",Student.class);
		model.addAttribute("searchStudent", student);
		return "search";
	}
	
	@RequestMapping(value = "/findStudent", method = RequestMethod.POST)
	public String findStudent(@ModelAttribute("searchStudent")Student stud,Model model) {
		container = new ClassPathXmlApplicationContext("SpringBean.xml");
		StudentDao dao = container.getBean("studentDao", StudentDao.class);
		List list = dao.searchStudent(stud);
		if (!list.isEmpty()) {
			model.addAttribute("data", list);
		} else {
			model.addAttribute("msg", "<span style='color:red;'>Oooops there is no records found.</span>");
		}
		return "search";
	}
	
	@RequestMapping(value = "/advancedSearch")
	public String loadAdvancedSearch(Model model) {
		container = new ClassPathXmlApplicationContext("SpringBean.xml");
		Student student = container.getBean("student",Student.class);
		model.addAttribute("advancedFindSearchStudent", student);
		return "advancedSearch";
	}
	
	@RequestMapping(value = "/advancedFindSearch",  method = RequestMethod.POST)
	public String loadAdvancedStudent(@ModelAttribute("advancedFindSearchStudent")Student stud,Model model) {
		container = new ClassPathXmlApplicationContext("SpringBean.xml");
		StudentDao dao = container.getBean("studentDao", StudentDao.class);
		List list = dao.advancedSerch(stud);
		if (!list.isEmpty()) {
			model.addAttribute("data", list);
		} else {
			model.addAttribute("msg", "Oooops there is no records found.");
		}
		return "advancedSearch";
	}
	
	
	@RequestMapping(value = "/editStudent",  method = RequestMethod.POST)
	public String updateStudent(@ModelAttribute("searchStudent")Student stud,Model model) {
		container = new ClassPathXmlApplicationContext("SpringBean.xml");
		StudentDao dao = container.getBean("studentDao", StudentDao.class);
		System.out.println(stud);
		List list = dao.updateStudent(stud);
		if (!list.isEmpty()) {
			model.addAttribute("data", list);
			model.addAttribute("msg", "Records updated successfully.........");
		} else {
			model.addAttribute("msg", "<span style='color:red;'>Oooops there is no records found.</span>");
		}
		return "search";
	}
	
	@RequestMapping(value = "/deleteStudent",  method = RequestMethod.POST)
	public String deleteStudent(@ModelAttribute("searchStudent")Student stud,Model model) {
		container = new ClassPathXmlApplicationContext("SpringBean.xml");
		StudentDao dao = container.getBean("studentDao", StudentDao.class);
	
		List list = dao.deleteStudent(stud);
		if (!list.isEmpty()) {
			model.addAttribute("data", list);
			model.addAttribute("msg", "Records Deleted successfully.........");
		} else {
			model.addAttribute("msg", "Oooops there is no records found.");
		}
		return "search";
	}
	
	@RequestMapping("/login")
	public String loadLoginPage(Model model) {
		container = new ClassPathXmlApplicationContext("SpringBean.xml");
		Student student = container.getBean("student",Student.class);
		model.addAttribute("studentBean", student);
		return "login";
	}
	
	
	@RequestMapping("/loginStudent")
	public String loginStudent(@ModelAttribute("studentBean")Student stud,Model model,HttpServletRequest request) {
		container = new ClassPathXmlApplicationContext("SpringBean.xml");
		StudentDao dao = container.getBean("studentDao", StudentDao.class);
	
		List list = dao.loginStudent(stud);
		if (!list.isEmpty()) {
			
			//stud.setFlag(true);
			HttpSession session = request.getSession();
			
			session.setAttribute("logindata", stud);
			//session.setAttribute("flag",stud.getFlag());
			
			model.addAttribute("data", list);
			model.addAttribute("msg", "<h4><span style='color:green'>Welcome "+stud.getStudentName()+"</span></h4>");
			return "userDashboard";
		} else {
			model.addAttribute("msg", "<span style='color:red;'>Incorrect Username and Email.</span>");
			return "login";
		}
		
	}
	
	@RequestMapping("/logout")
	public String logoutStudent(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Student student = (Student)session.getAttribute("logindata");
		student.setFlag(false);
		return "redirect:/";
	}
	
}
