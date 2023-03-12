package miki.fruityloops.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import miki.fruityloops.models.Item;

@Controller
public class ItemController {
    // class definition and imports here...

    @GetMapping("/")
    public String index(Model model) {
        ArrayList<Item> fruits = new ArrayList<Item>();
        fruits.add(new Item("Kiwi", 1.5));
        fruits.add(new Item("Mango", 2.0));
        fruits.add(new Item("Goji Berries", 4.0));
        fruits.add(new Item("Guava", .75));

        // Add fruits your view model here
        model.addAttribute("fruits", fruits);

        return "index.jsp";
    }
    // ...

}
