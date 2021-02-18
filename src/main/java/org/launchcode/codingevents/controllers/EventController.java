package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String returnIndex(Model model){
        List<String> events = new ArrayList<String>();
        events.add("playing a game");
        events.add("Cooking favourite food");
        events.add("Singing a song");
        events.add("Learning Java");
        events.add("Watching movies");

        model.addAttribute("events", events);
        return "events/index";
    }

}
