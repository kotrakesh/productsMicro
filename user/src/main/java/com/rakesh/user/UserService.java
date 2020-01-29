package com.rakesh.user;


import com.rakesh.user.User;
import com.rakesh.user.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserCrudRepository userCrudRepository;

    public List<User> getAllUsers(){

        List<User> users = new ArrayList<>();
        userCrudRepository.findAll()
                .forEach(users::add);
        return users;
    }

    public void addUser(User user){
        userCrudRepository.save(user);
    }

    public Optional<User> getUser(int id){
        return userCrudRepository.findById(id);
    }
}

