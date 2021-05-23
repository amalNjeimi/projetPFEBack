package com.example.projetpfe.Controller;

import com.example.projetpfe.Repository.UserRepository;
import com.example.projetpfe.Service.ProfilService;
import com.example.projetpfe.Service.UserService;
import com.example.projetpfe.entites.Profil;
import com.example.projetpfe.entites.Projet;
import com.example.projetpfe.entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin(origins = "http://localhost:4200")
public class userController {
    @Autowired
    UserRepository userRep;
    private List<Projet> projects;


    @RequestMapping(value = "login/{nomUtilisateur}", method = RequestMethod.GET)
    public User getUserByNomUtilisateur(@PathVariable("nomUtilisateur") String nomUtilisateur) {
        return userRep.findByNomUtilisateur(nomUtilisateur);
    }

    @Autowired
    UserService userService;

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @DeleteMapping("users/delete/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable("id") Long id) {
        userService.deleteUserById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("users/update")
    public ResponseEntity<User> updateUser(@RequestBody User U) {
        User updateUser = userService.updateUser(U);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }

    @PostMapping("users/add")
    public ResponseEntity<User> addUser(@RequestBody User U) {
        User newUser = userService.SaveUser(U);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping("users/projects/{id]")
    public ResponseEntity<Projet> getProjectsByUser(@PathVariable("id") Long id) {
        List<Projet> projects = userService.findProjectsByUser(id);
        return new ResponseEntity(projects, HttpStatus.OK);
    }


}
