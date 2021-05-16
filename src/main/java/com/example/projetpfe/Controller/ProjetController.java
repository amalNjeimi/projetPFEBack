package com.example.projetpfe.Controller;

import com.example.projetpfe.Service.ProjetService;
import com.example.projetpfe.entites.Projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projets/api")
@CrossOrigin(origins ="http://localhost:4200")
public class ProjetController {
    @Autowired
    ProjetService projetService;

               @RequestMapping (method=RequestMethod.GET)
public ResponseEntity<List<Projet>> getAllProjets () {
    List<Projet> projets = projetService.getAllProjets();
    return new ResponseEntity<>(projets, HttpStatus.OK);
}
@DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProjetById(@PathVariable("id") Long id) {
        projetService.deleteProjetById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Projet> updateProjet(@RequestBody Projet p) {
        Projet updateProjet = projetService.updateProjett(p);
        return new ResponseEntity<>(updateProjet, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Projet> addProjet(@RequestBody Projet p) {
        Projet newProjet = projetService.saveProjet(p);
        return new ResponseEntity<>(newProjet, HttpStatus.CREATED);
    }
}
