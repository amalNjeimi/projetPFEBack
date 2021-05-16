package com.example.projetpfe.entites;


import javax.persistence.*;
import java.util.List;

@Entity
public class Structure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStructure;
    private String nomStructure;

    @OneToMany
    private List<User>users;

    public Structure() {
    }

    public Structure(String nomStructure) {
        this.nomStructure = nomStructure;
    }

    public Long getIdStructure() {
        return idStructure;
    }

    public void setIdStructure(Long idStructure) {
        this.idStructure = idStructure;
    }

    public String getNomStructure() {
        return nomStructure;
    }

    public void setNomStructure(String nomStructure) {
        this.nomStructure = nomStructure;
    }

    @Override
    public String toString() {
        return "Structure{" +
                "idStructure=" + idStructure +
                ", nomStructure='" + nomStructure + '\'' +
                '}';
    }
}
