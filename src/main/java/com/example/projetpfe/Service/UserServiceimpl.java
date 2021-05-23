package com.example.projetpfe.Service;

import com.example.projetpfe.Repository.UserRepository;
import com.example.projetpfe.entites.Projet;
import com.example.projetpfe.entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService{
    @Autowired
    UserRepository userREp;

    @Override
    public User SaveUser(User u) {
        return userREp.save(u);
    }



    @Override
    public List<User> getAllUsers() {
        return userREp.findAll();
    }

    @Override
    public User updateUser(User U) {
        return userREp.save(U);
    }

    @Override
    public void deleteUser(User U) {
       userREp.delete(U);
    }

    @Override
    public void deleteUserById(Long id) {
userREp.deleteById(id);
    }

    @Override
    public User getUser(Long id) {
        return userREp.findById(id).get();
    }

    @Override
    public List<Projet> findProjectsByUser(Long id) {
        return userREp.findProjectsByUser(id);
    }
}
