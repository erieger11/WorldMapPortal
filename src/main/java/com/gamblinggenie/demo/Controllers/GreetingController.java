package com.gamblinggenie.demo.Controllers;
import com.gamblinggenie.demo.Model.User;
import com.gamblinggenie.demo.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GreetingController {
    @Autowired
    GreetingService greetingService;

    @GetMapping("/login")
    public User loginPage(@RequestParam(name="username", required=true, defaultValue="Crazy person") String username,
                            @RequestParam(name="password", required=true, defaultValue="Crazy person") String password) {
        User user = new User(username,password);
         greetingService.validateUser(user);
         return user;
    }


    @GetMapping("/portal")
    public String homePage() {
        return "portal";
    }

    @GetMapping("/worldMap")
    public String worldMapPage() {
        return "worldMap";
    }

    @GetMapping("/unitedStates")
    public String unitesStatesPage() {
        return "unitedStates";
    }
}