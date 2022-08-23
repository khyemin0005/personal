package net.softsociety.personal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.personal.domain.Member;
import net.softsociety.personal.service.MemberService;

@Slf4j
@Controller
@RequestMapping("member")
public class MemberController { // service -> serviceImpl에 implements // Impl에 @Service, DAO에 mapper
	
	@Autowired
	MemberService service;
	
	@GetMapping("joinForm")
	public String joinForm() {
		log.debug("Move to joinForm");
		return "/memberView/joinForm";
	}
	
	@PostMapping("join")
	public String join(Member member) {
		log.debug("Member: {}", member);
		service.insertMember(member);
		return "redirect:/";
	}
	
	@GetMapping("loginForm")
	public String loginForm() {
		log.debug("Move to loginForm");
		return "/memberView/loginForm";
	}

}
