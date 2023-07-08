package com.example.springthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

  @GetMapping
  public ModelAndView indexPage(ModelMap model) {
    return new ModelAndView("index", model);
  }
}
