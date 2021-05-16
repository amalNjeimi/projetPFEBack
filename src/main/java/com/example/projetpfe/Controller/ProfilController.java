package com.example.projetpfe.Controller;

import com.example.projetpfe.Service.ProfilService;
import com.example.projetpfe.Service.ProjetService;
import com.example.projetpfe.entites.Profil;
import com.example.projetpfe.entites.Projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profils/api")
@CrossOrigin(origins ="http://localhost:4200")
public class ProfilController {
    @Autowired
    ProfilService profilService;

    @RequestMapping (method= RequestMethod.GET)
    public ResponseEntity<List<Profil>> getAllProfils () {
        List<Profil> profils = profilService.getAllProfils();
        return new ResponseEntity<>(profils, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProfilById(@PathVariable("id") Long id) {
        profilService.deleteProfilById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Profil> updateProfil(@RequestBody Profil pf) {
        Profil updateProfil = profilService.updateProfil(pf);
        return new ResponseEntity<>(updateProfil, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Profil> addProfil(@RequestBody Profil pf) {
        Profil newProfil = profilService.saveProfil(pf);
        return new ResponseEntity<>(newProfil, HttpStatus.CREATED);
    }
}
