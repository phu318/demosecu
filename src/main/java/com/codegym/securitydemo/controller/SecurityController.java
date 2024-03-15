package com.codegym.securitydemo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class SecurityController {
    @GetMapping("/home")
    public ModelAndView index(){
        return new ModelAndView("index");
    }
    @GetMapping("/admin")
    public ModelAndView admin(){
        return new ModelAndView("admin");
    }
//    @PreAuthorize("hasAnyRole('USER')")
    @GetMapping("/user")
    public ModelAndView user(){
        return new ModelAndView("user");
    }
}
