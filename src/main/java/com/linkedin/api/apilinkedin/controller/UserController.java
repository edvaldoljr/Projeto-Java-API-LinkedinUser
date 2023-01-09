package com.linkedin.api.apilinkedin.controller;

import com.linkedin.api.apilinkedin.entities.Users;
import com.linkedin.api.apilinkedin.exceptions.UserNotFoundException;
import com.linkedin.api.apilinkedin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    //Post
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Users createUser(@RequestBody  Users users){
        return userService.postUser(users);
    }

    //Get
    @GetMapping
    public List<Users> getUser(){
        return userService.getUser();
    }

    //Get{id}
    @GetMapping("/{id}")
    public ResponseEntity<Users> getUserById(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(userService.getUserById(id).orElseThrow(() ->
                new UserNotFoundException("User ID:" + id + "Was not found!")));
    }

    //Put{id}
    @PutMapping("/{id}")
    public Object putUser(@PathVariable Long id, @RequestBody Users users) throws UserNotFoundException {
        try {
            return userService.putUser(users);
        } catch (Exception ex) {
            return ("User ID:" + id + "Was not found!");
        }
    }

    //Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Users> deleteUser(@PathVariable Long id) throws UserNotFoundException{
        try {
            userService.deleteUser(id);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return ResponseEntity.ok().build();
    }
}
