package com.gamblinggenie.demo.Controllers;
import com.gamblinggenie.demo.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class GreetingController {
    @Autowired
    GreetingService greetingService;

    @GetMapping("/login")
    public String loginPage(@RequestParam(name="name", required=false, defaultValue="Crazy person ") String name, Model model) {
        model.addAttribute("name", name);
        return "login";
    }


    @GetMapping("/portal")
    public String homePage() {
        return "portal";
    }


    @GetMapping("/worldMap")
    public String worldMapPage() {
        greetingService.hello();
        return "worldMap";
    }
}