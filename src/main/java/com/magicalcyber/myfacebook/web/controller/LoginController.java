package com.magicalcyber.myfacebook.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/login")
	String loginPage() {
		return "login";
	}
}
