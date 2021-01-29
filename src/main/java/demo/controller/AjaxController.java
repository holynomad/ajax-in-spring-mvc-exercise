package demo.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class AjaxController {

    /*
    @RequestMapping("/")
    public String index(Model model) {
        System.out.println("/index.jsp call...");

        model.addAttribute("name", "I'm HIS Macgyver");
        return "starter";
    }
     */


    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        System.out.println("index call");

        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String demo1() {
        System.out.println("Demo1 call...");

        return "Demo 1";
    }

    @RequestMapping(value = "/{fullName}", method = RequestMethod.GET)
    @ResponseBody
    public String demo2(@PathVariable("fullName") String fullName) {
        System.out.println("Demo2 call...");

        return "Hi " + fullName;
    }
}
