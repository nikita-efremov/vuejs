package example.vuejs.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by nefremov on 23.05.2018.
 *
 * @author Nikita Efremov
 */
@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String index() {
        return "index";
    }
}
