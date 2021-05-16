package com.example.projetpfe.Controller;

import com.example.projetpfe.Service.ProfilService;
import com.example.projetpfe.Service.StructureService;
import com.example.projetpfe.entites.Profil;
import com.example.projetpfe.entites.Structure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/structures/api")
@CrossOrigin(origins ="http://localhost:4200")
public class StructureController {
    @Autowired
    StructureService structureService;

    @RequestMapping(method= RequestMethod.GET)
    public ResponseEntity<List<Structure>> getAllStructures() {
        List<Structure> structures = structureService.getAllStructure();
        return new ResponseEntity<>(structures, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStructureById(@PathVariable("id") Long id) {
        structureService.deleteStructureById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Structure> updateStructure(@RequestBody Structure S) {
        Structure updateStructure = structureService.updateStructure(S);
        return new ResponseEntity<>(updateStructure, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Structure> addStructure(@RequestBody Structure S) {
        Structure newStructure = structureService.saveStructure(S);
        return new ResponseEntity<>(newStructure, HttpStatus.CREATED);
    }
}
