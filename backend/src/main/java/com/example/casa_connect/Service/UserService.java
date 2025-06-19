package com.example.casa_connect.Service;

import com.example.casa_connect.Entity.User;
import com.example.casa_connect.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //get all users

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    //create user

    public User createUser(User user){
        return userRepository.save(user);
    }

    //get user by id

    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }

    //delete user

    public void deleteUser(Long id){
         userRepository.deleteById(id);
    }
}
