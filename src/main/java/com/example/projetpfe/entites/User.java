package com.example.projetpfe.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long utilisateur_id;
    private String nomUtilisateur;
    private String motDePasse;
    private Boolean isActif ;
    private Boolean isChefProjet ;
    private Boolean isAdmin;
    private Boolean issupprimer ;
    private Date datenaissance;
    private Long telechone;
    private String nom;
    private String prenom;
    private String email;
@JsonIgnore
    @ManyToMany(mappedBy = "users")

    Set<Projet> projets=new HashSet<>();

    public User() {
    }

    public User(String nomUtilisateur, String motDePasse, Boolean isActif, Boolean isChefProjet, Boolean isAdmin, Boolean issupprimer, Date datenaissance, Long telechone, String nom, String prenom, String email, Set<Projet> projets) {
        this.nomUtilisateur = nomUtilisateur;
        this.motDePasse = motDePasse;
        this.isActif = isActif;
        this.isChefProjet = isChefProjet;
        this.isAdmin = isAdmin;
        this.issupprimer = issupprimer;
        this.datenaissance = datenaissance;
        this.telechone = telechone;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;

    }

    public Long getUtilisateur_id() {
        return utilisateur_id;
    }

    public void setUtilisateur_id(Long utilisateur_id) {
        this.utilisateur_id = utilisateur_id;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public Boolean getActif() {
        return isActif;
    }

    public void setActif(Boolean actif) {
        isActif = actif;
    }

    public Boolean getChefProjet() {
        return isChefProjet;
    }

    public void setChefProjet(Boolean chefProjet) {
        isChefProjet = chefProjet;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public Boolean getIssupprimer() {
        return issupprimer;
    }

    public void setIssupprimer(Boolean issupprimer) {
        this.issupprimer = issupprimer;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

    public Long getTelechone() {
        return telechone;
    }

    public void setTelechone(Long telechone) {
        this.telechone = telechone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "utilisateur_id=" + utilisateur_id +
                ", nomUtilisateur='" + nomUtilisateur + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", isActif=" + isActif +
                ", isChefProjet=" + isChefProjet +
                ", isAdmin=" + isAdmin +
                ", issupprimer=" + issupprimer +
                ", datenaissance=" + datenaissance +
                ", telechone=" + telechone +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
