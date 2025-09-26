package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Venue;
import be.thomasmore.party.repositories.VenueRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VenueController {
    private VenueRepository venueRepository;

    public VenueController(VenueRepository venueRepository){
        this.venueRepository = venueRepository;
    };
    Venue venue = new Venue();
    @GetMapping("/venuedetails")
    public String venueDetails(Model model) {
        venueRepository.findById(1);
        venue.setVenueName("BoesjKammeree");
        venue.setLinkMoreInfo("https");
        venue.setVenueName("Hallo Hallo It's Party Time");
        model.addAttribute("venue", venue);
        return "venuedetails";


    }
//    @GetMapping({"/","/home"})
//    public String home(Model model) {
//        int myCalculatedvalue= 2342*2345;
//        model.addAttribute("myCalculatedvalue", myCalculatedvalue);
//        return "home";
//    }
//    @GetMapping ("/about")
//    public String about(Model model) {
//        String myName = "Hasan";
//        String myStreet= "Hof van Tichelen";
//        String myCity = "Antwerpen";
//        model.addAttribute("myName", myName);
//        model.addAttribute("myStreet", myStreet);
//        model.addAttribute("myCity", myCity);
//        return "about";
//    }


}
