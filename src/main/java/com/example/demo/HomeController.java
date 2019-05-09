package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
    @RequestMapping("/Crabcake")
    public String homepage() {
        return "crabcake";
    }
    @RequestMapping("/recipe")
    public String crapcape () {
        return "recipe";
    }
    @RequestMapping("/recipe1")
    public String recepie (){
        return "recipe1";
    }
    @RequestMapping("/recipe2")
    public String recipe2(){
        return "recipe2";
    }
    @RequestMapping("/recipe3")
    public String recipe3 (){
        return "recipe3";
    }
    @RequestMapping("/recipe4")
    public String recipe4 (){
        return "recipe4";
    }
    @RequestMapping("/boodstrap")
    public String bootstrap(){
        return "bootstrap";
    }
}
