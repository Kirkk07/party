package be.thomasmore.party.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HomeController {
    @GetMapping({"/","/home"})
    public String home(Model model) {
        int myCalculatedvalue= 2342*2345;
        model.addAttribute("myCalculatedvalue", myCalculatedvalue);
        return "home";
    }
    @GetMapping ("/about")
    public String about(Model model) {
        String myName = "Hasan";
        String myStreet= "Hof van Tichelen";
        String myCity = "Antwerpen";
        model.addAttribute("myName", myName);
        model.addAttribute("myStreet", myStreet);
        model.addAttribute("myCity", myCity);
        return "about";
    }

    @GetMapping ("/pay")
    public String pay(Model model){
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedNow = now.format(formatter);

        LocalDateTime payDate = LocalDateTime.now().plusDays(30);
        String formattedDate = payDate.format(formatter);
        model.addAttribute("payDate", formattedDate);
        model.addAttribute("now", formattedNow);
        return "pay";
    }

    @GetMapping("/pay1")
    public String pay3(Model model){
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedNow = now.format(formatter);
        model.addAttribute("now", now);
        model.addAttribute("ab", formattedNow);

        return "pay1";
    }
//    @GetMapping ("/kay")
//    public String kay(){
//        return "homme07";
//    }
}
