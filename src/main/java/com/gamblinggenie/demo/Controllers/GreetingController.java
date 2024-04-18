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




    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Crazy person ") String name, Model model) {
        greetingService.hello();
        model.addAttribute("name", name);
        return "frontPage";  // This corresponds to src/main/resources/templates/index.html
    }
}