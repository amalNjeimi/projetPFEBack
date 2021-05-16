package com.example.projetpfe.Service;

import com.example.projetpfe.Repository.ProjetReposiory;
import com.example.projetpfe.Repository.StructureRepository;
import com.example.projetpfe.entites.Projet;
import com.example.projetpfe.entites.Structure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StructureServiceimpl implements StructureService{
    @Autowired
    StructureRepository structureRep;
    @Override
    public Structure saveStructure(Structure S) {
        return structureRep.save(S);
    }

    @Override
    public Structure updateStructure(Structure S) {
        return structureRep.save(S);
    }

    @Override
    public void deleteStructure(Structure S) {
        structureRep.delete(S);
    }

    @Override
    public void deleteStructureById(Long id) {
        structureRep.deleteById(id);

    }

    @Override
    public Structure getStructure(Long id) {
        return structureRep.findById(id).get();

    }

    @Override
    public List<Structure> getAllStructure() {
            return structureRep.findAll();
        }
    }
