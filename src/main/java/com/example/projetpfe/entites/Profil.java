package com.example.projetpfe.entites;

import javax.persistence.*;
import java.util.List;

@Entity
public class Profil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfil;
    private String NomProfil;

   


    public Profil() {
    }

    public Profil(String nomProfil) {
        NomProfil = nomProfil;
    }

    public Long getIdProfil() {
        return idProfil;
    }

    public void setIdProfil(Long idProfil) {
        this.idProfil = idProfil;
    }

    public String getNomProfil() {
        return NomProfil;
    }

    public void setNomProfil(String nomProfil) {
        NomProfil = nomProfil;
    }

    @Override
    public String toString() {
        return "Profil{" +
                "idProfil=" + idProfil +
                ", NomProfil='" + NomProfil + '\'' +
                '}';
    }
}


