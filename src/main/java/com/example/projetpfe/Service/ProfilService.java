package com.example.projetpfe.Service;

import com.example.projetpfe.entites.Profil;


import java.util.List;

public interface ProfilService {

    Profil saveProfil(Profil pf);

    Profil updateProfil(Profil pf);

    void deleteProfil(Profil pf);

    void deleteProfilById(Long id);

    Profil getProfil(Long id);

    List<Profil> getAllProfils();

}
