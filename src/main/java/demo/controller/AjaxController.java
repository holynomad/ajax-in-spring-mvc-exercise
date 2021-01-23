package demo.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("ajax")
public class AjaxController {

    @RequestMapping("/")
    public String index(Model model) {
        System.out.println("/index.jsp call...");

        model.addAttribute("name", "I'm HIS Macgyver");
        return "starter";
    }

    @RequestMapping(value = "demo1", method = RequestMethod.GET)
    @ResponseBody
    public String demo1() {
        System.out.println("/Demo1 call...");

        return "Demo 1";
    }

    @RequestMapping(value = "demo2/{fullName}", method = RequestMethod.GET)
    @ResponseBody
    public String demo2(@PathVariable("fullName") String fullName) {
        System.out.println("/Demo2 call...");

        return "Hi " + fullName;
    }
}
