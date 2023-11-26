package sportyTreasure.finalProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    @GetMapping("/")
    public String indexO() {
        System.out.println("ENTRO");
        return "index";
    }
}
