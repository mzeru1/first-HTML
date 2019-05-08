package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
    @RequestMapping("/")
    public String homepage() {
        return "index";
    }
    @RequestMapping("/Crabcake")
    public String crapcape () {
        return "Crabcake";
    }
}
