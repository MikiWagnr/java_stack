package miki.dojoninja.controllers;

// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

// import miki.dojoninja.models.Dojo;
import miki.dojoninja.models.Ninja;
import miki.dojoninja.services.DojoService;
import miki.dojoninja.services.NinjaService;

@Controller
public class NinjaController {
    
    @Autowired DojoService dojoService;
    @Autowired NinjaService ninjaService;

    @PostMapping("/ninjas")
    public String createNinja(@ModelAttribute("ninja")Ninja ninja){
        ninjaService.createNinja(ninja);
        return "redirect:/";
    }

    @GetMapping("/ninjas/new")
    public String newNinja(@ModelAttribute("ninja")Ninja ninja, Model model){
        // List<Dojo> dojos = dojoService.getAllDojos();
        // System.out.println(dojos);
        model.addAttribute("dojos", dojoService.getAllDojos());
        return "ninjas/index.jsp";
    }
}
