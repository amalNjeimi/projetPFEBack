package com.example.projetpfe.Service;

import com.example.projetpfe.entites.Projet;
import com.example.projetpfe.entites.User;

import java.util.List;

public interface UserService {
    User SaveUser(User u);

    List<User> getAllUsers();

    User updateUser (User  U);

    void deleteUser(User U);

    void deleteUserById(Long id);

    User getUser(Long id);
    List<Projet> findProjectsByUser(Long  id );


}
