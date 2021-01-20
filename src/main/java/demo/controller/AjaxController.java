package demo.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AjaxController {

    @RequestMapping("/")
    public String starter(Model model) {
        System.out.println("/index.jsp call...");

        model.addAttribute("name", "I'm HIS Macgyver");
        return "index";
    }

    @RequestMapping(value = "demo1", method = RequestMethod.GET)
    @ResponseBody
    public String demo1() {
        System.out.println("/Demo1 call...");

        return "Demo1";
    }
}
