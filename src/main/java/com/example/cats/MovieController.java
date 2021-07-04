package com.example.cats;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MovieController {


    @GetMapping("/en")
    public ModelAndView indexen () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("indexen.html");
        return modelAndView;
    }

}
