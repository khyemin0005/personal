package net.softsociety.personal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.softsociety.personal.service.MemberService;

@Controller
public class HomeController {

	@Autowired
	MemberService service;
	
	@GetMapping({"", "/"})
	public String home(Model model) {
		return "home";
	}
}
