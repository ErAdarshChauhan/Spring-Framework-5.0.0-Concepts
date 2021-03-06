package com.chauhansoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage() {
        return "index";
    }

    @RequestMapping("/result")
    public ModelAndView homePage(@RequestParam("value") String dataValue) {
        String data = "Hi";
        System.out.println(data);
        System.out.println(dataValue);
        ModelAndView mav = new ModelAndView();
        mav.addObject("value", dataValue);
        mav.setViewName("index");
        return mav;
    }

//	@RequestMapping("/result")
//	public String homePage(@RequestParam("value") String dataValue, Model model) {
//		String data = "Hi";
//		System.out.println(data);
//		System.out.println(dataValue);
//		model.addAttribute("value", dataValue);
//		return "index";
//	}
}
