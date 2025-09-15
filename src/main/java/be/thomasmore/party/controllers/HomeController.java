package be.thomasmore.party.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        int myCalculatedvalue= 2342*2345;
        model.addAttribute("myCalculatedvalue", myCalculatedvalue);
        return "home";
    }
    @GetMapping ("about")
    public String about(Model model) {
        String myName = "Thomas";
        String myStreet= "Van HofTichelen";
        String myCity = "Antwerpen";
        model.addAttribute("myName", myName);
        model.addAttribute("myStreet", myStreet);
        model.addAttribute("myCity", myCity);
        return "about";
    }@GetMapping ("/home")
    public String homme(){
        return "homme07";
    }
}
