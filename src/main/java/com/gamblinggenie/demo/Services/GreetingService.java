package com.gamblinggenie.demo.Services;
import com.gamblinggenie.demo.Model.User;
import org.springframework.stereotype.Service;
import java.util.HashMap;


@Service
public class GreetingService {

    HashMap<String, String> accounts = new HashMap<>();

    public void add(){
        accounts.put("ethan","1234");
        accounts.put("bob","4321");
    }


    public boolean validateUser(User user){
        add();
        return user.getPassword().equals(accounts.get(user.getUsername()));
    }

}
