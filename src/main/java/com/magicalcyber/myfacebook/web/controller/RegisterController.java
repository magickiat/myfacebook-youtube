package com.magicalcyber.myfacebook.web.controller;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
 
import com.magicalcyber.myfacebook.web.form.RegisterForm;
 
@Controller
public class RegisterController {
 
    private static final Logger log = LoggerFactory.getLogger(RegisterController.class);
 
    @PostMapping("/register")
    String register(RegisterForm registerForm) {
        log.info(registerForm.toString());
        return "index";
    }
}