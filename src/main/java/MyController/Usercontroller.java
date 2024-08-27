package com.Glab30952.myController;

import com.Glab30952.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {
    @PostMapping("/users")
    public void printData(@RequestBody User user) {
        System.out.println("Printing the user data:"+user);
    }
    @GetMapping("/")
    public String home(){
        return "hello world";
    }
}