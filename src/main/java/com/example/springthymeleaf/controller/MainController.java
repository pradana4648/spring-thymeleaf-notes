package com.example.springthymeleaf.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

  @GetMapping
  public ModelAndView indexPage(ModelMap model) {
    List<String> menus = List.of("about us", "services", "pricing", "blog", "contact");
    model.put("menus", menus);
    return new ModelAndView("index", model);
  }
}
