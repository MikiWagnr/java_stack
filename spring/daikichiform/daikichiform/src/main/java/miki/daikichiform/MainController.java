package miki.daikichiform;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
    
    @GetMapping("/")
    public String index(){
        return "index.jsp";
    }

    @GetMapping("/show")
    public String show(){
        return "show.jsp";
    }

    @PostMapping("/handleform")
    public String handledata(
        @RequestParam(value="number") Integer number,
        @RequestParam(value = "city") String city,
        @RequestParam(value = "person") String person,
        @RequestParam(value = "job") String job,
        @RequestParam(value = "livingthing") String livingthing,
        @RequestParam(value = "comment") String comment,

        HttpSession session
    ) {

        session.setAttribute("number", number);
        session.setAttribute("city", city);
        session.setAttribute("person", person);
        session.setAttribute("job", job);
        session.setAttribute("livingthing", livingthing);
        session.setAttribute("comment", comment);

        System.out.printf("these are the form values: %d , %s, %s, %s, %s, %s ",  number ,  city ,  person, job, livingthing, comment);
        return "redirect:/show";
    }
    

}
