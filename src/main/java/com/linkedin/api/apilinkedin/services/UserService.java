package com.linkedin.api.apilinkedin.services;

import com.linkedin.api.apilinkedin.entities.Users;
import com.linkedin.api.apilinkedin.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private IUserRepository iUserRepository;

    @Autowired
    public UserService(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }

    //Post
    public Users postUser(Users users) {
        return  iUserRepository.save(users);
    }

    //Get
    public List<Users> getUser() {
        return iUserRepository.findAll();
    }

    public Optional<Users> getUserById(Long id) {
        return iUserRepository.findById(id);
    }

    public Users putUser(Users users) {
        return iUserRepository.save(users);
    }

    public void deleteUser(Long id) {
         iUserRepository.deleteById(id);
    }
}
