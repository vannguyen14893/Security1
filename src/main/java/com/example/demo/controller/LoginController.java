package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService loginService;

	@GetMapping(value = "/login")
	public String login() {
		return "login";
	}

	@GetMapping(value = "/home")
	public String home(ModelMap map) {
		String username = loginService.getPrincipal();
		map.addAttribute("name", username);
		return "home";
	}

	@GetMapping(value = "/admin/info")
	public String info() {
		return "info";
	}

	@GetMapping(value = "/db/info")
	public String info2() {
		return "info2";
	}
}
