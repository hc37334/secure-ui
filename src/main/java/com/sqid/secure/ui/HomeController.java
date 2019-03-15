package com.sqid.secure.ui;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@EnableOAuth2Sso
public class HomeController {
//    @RequestMapping("/")
//    public String home(Model model){
//        model.addAttribute("pageTitle","Welcome to my Awesome Dynamic Application");
//        return "index";
//    }
    
    
    @RequestMapping("/")
    public String home(){
        //model.addAttribute("pageTitle","Welcome to my Awesome Dynamic Application");
        return "Home"; //page name
    }
}
