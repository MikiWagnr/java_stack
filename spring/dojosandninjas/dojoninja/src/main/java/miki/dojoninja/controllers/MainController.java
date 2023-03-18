package miki.dojoninja.controllers;

// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// import miki.dojoninja.models.Dojo;
import miki.dojoninja.services.DojoService;
import miki.dojoninja.services.NinjaService;

@Controller
public class MainController {
    
    @Autowired DojoService dojoService;
    @Autowired NinjaService ninjaService;

        //! READ ALL
        @GetMapping("/")
        public String index(Model model){
            // List<Dojo> dojos = dojoService.getAllDojos();
            model.addAttribute("dojos", dojoService.getAllDojos());
            return "index.jsp";
        }
}
