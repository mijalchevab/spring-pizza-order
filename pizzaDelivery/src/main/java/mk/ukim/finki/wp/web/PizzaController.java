package mk.ukim.finki.wp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PizzaController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String hello() {
        return "index";
    }

}
