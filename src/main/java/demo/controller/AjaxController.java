package demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("ajax")
public class AjaxController {
    @RequestMapping(method = RequestMethod.GET)
    public String Index() {
        return "ajax/index";
    }
}
