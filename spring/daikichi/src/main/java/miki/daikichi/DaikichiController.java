package miki.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {

    @RequestMapping("/")
    public String index() {
        return "Welcome!";
    }

    @RequestMapping("/{pathvar}")
    public String today(@PathVariable("pathvar") String pathvar) {
        if (pathvar.equals("today")) {
            return "Today you will find luck in all of your endeavors";
        }
        if (pathvar.equals("tomorrow")) {
            return "Today you will find luck in all of your endeavors";
        }
        return "Idk :(";
    }

    @RequestMapping("/{pathvar1}/{pathvar2}")
    public String travelorlotto(
        @PathVariable("pathvar1")String pathvar1,
        @PathVariable("pathvar2")String pathvar2
    ){
        if(pathvar1.equals("travel")){
            return String.format("Congratulations you'll soon travel to %s!\n", pathvar2);
        }if(pathvar1.equals("lotto")){
            int pathvar3 = Integer.parseInt(pathvar2);
            if(pathvar3 % 2 == 0){
                return "You will take a grand journey in the near future, but be weary of tempting offers";
            } else{
                return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
            }
        }
        return "idk";
    }
}
