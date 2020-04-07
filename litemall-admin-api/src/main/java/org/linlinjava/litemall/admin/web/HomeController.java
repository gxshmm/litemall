package org.linlinjava.litemall.admin.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    @RequestMapping("/index")
    public String home(){
        return "it works!";
    }
}
