package com.example.springthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

  @GetMapping("/")
  public ModelAndView indexPage() {
    return new ModelAndView("index");
  }

  @GetMapping("/add")
  public ModelAndView addPage() {
    return new ModelAndView("add");
  }
}
