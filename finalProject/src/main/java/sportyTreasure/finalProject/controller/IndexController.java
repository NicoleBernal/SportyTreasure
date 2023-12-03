package sportyTreasure.finalProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/home")
public class IndexController {

    @GetMapping
    public String indexO() {
        System.out.println("ENTRO");
        return "index";
    }
}
