package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @GetMapping("/save")
    public String save(){
        return "select";
    }
    @PostMapping("/save")
    public String getSeclect(@RequestParam("condiments") String[] condiments, Model model){
        model.addAttribute("condiments", condiments);
        return "index";

    }

}
