package com.example.projetpfe.Service;

import com.example.projetpfe.Repository.ProjetReposiory;
import com.example.projetpfe.entites.Projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service


public class ProjetServiceimpl implements ProjetService {
@Autowired
    ProjetReposiory projetRep;

    @Override
    public Projet saveProjet(Projet p) {
        return projetRep.save(p);
    }

    @Override
    public Projet updateProjett(Projet p) {
        return projetRep.save(p);
    }

    @Override
    public void deleteProjet(Projet p) {
        projetRep.delete(p);
    }

    @Override
    public void deleteProjetById(Long id) {

        projetRep.deleteById(id);
    }

    @Override
    public Projet getProjet(Long id) {
        return projetRep.findById(id).get();
    }

    @Override
    public List<Projet> getAllProjets() {
        return projetRep.findAll();
    }
}
