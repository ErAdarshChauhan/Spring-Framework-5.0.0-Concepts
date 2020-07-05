package org.chauhansoft.controller;

import javax.validation.Valid;

import org.chauhansoft.model.BusModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BusController {

	@RequestMapping("/ticketBooking")
	public String showReservationForm(Model model) {
		model.addAttribute("busModel", new BusModel());
		System.out.println("from showReservationForm");
		return "reservationForm";
	}
	
	@RequestMapping(value = "/ticket",method = RequestMethod.POST)
	public String showReservationDetails(@Valid @ModelAttribute("busModel") BusModel bmodel, BindingResult br) {
		if (br.hasErrors()) {
			return "reservationForm";
		} else {
			System.out.println("showReservationDetails");
			return "display";
		}
		
	}
//	Plot No: E-683, Shiksha Bharti Hidh School Street, Near Air Force Road, NIT Faridabad, Haryana - 121001
	
	
}
