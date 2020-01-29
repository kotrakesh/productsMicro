package com.rakesh.user;

import com.rakesh.user.User;
import com.rakesh.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    UserService userService=new UserService();

    @RequestMapping("/users")
    public List<User> getAllProducts(){
        return userService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.POST,path = "/addUser")
    public void addProduct(@RequestBody User user){
        User p =new User();
        userService.addUser(user);

    }


}
