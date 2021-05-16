package com.example.projetpfe.Service;

import com.example.projetpfe.entites.Profil;
import com.example.projetpfe.entites.Structure;

import java.util.List;

public interface StructureService {
    Structure saveStructure(Structure S);

    Structure updateStructure(Structure S);

    void deleteStructure(Structure S);

    void deleteStructureById(Long id);

    Structure getStructure(Long id);

    List<Structure> getAllStructure();
}
