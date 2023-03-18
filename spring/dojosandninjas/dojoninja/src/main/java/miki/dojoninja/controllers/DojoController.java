package miki.dojoninja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import miki.dojoninja.models.Dojo;
import miki.dojoninja.services.DojoService;

@Controller
public class DojoController {

    @Autowired DojoService dojoService;

    @GetMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojo")Dojo dojo){
        return "dojos/index.jsp";
    }
    
    @PostMapping("/dojos")
    public String createDojo(@ModelAttribute("dojo")Dojo dojo){
        dojoService.createDojo(dojo);
        return "redirect:/";
    }

    @GetMapping("/dojos/{id}")
    public String show(@PathVariable("id")Long id, Model model){
        //call to the service method for one dojo
        Dojo dojo = dojoService.getOneDojo(id);
        System.out.println(dojo);
        // sends DB data to the view
        model.addAttribute("dojo", dojo);
        // return the view one page.
        return "/dojos/show.jsp";
    }
}



