package com.example.projetpfe.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ref_projet;
    private String intitule;
    private long cout;
    private boolean En_difficulte;
    private String stade;
    private Date date_ajout;
    private Date date_mise_ajour;
    private Date datedebut;
    private Date datefin;
    private String difficulte;

    @JsonIgnore
    @ManyToMany
    Set<User> users=new HashSet<>();

    public Projet() {
    }

    public Projet(String intitule, long cout, boolean en_difficulte, String stade, Date date_ajout, Date date_mise_ajour, Date datedebut, Date datefin, String difficulte) {
        this.intitule = intitule;
        this.cout = cout;
        En_difficulte = en_difficulte;
        this.stade = stade;
        this.date_ajout = date_ajout;
        this.date_mise_ajour = date_mise_ajour;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.difficulte = difficulte;
    }

    public long getRef_projet() {
        return ref_projet;
    }

    public void setRef_projet(long ref_projet) {
        this.ref_projet = ref_projet;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public long getCout() {
        return cout;
    }

    public void setCout(long cout) {
        this.cout = cout;
    }

    public boolean isEn_difficulte() {
        return En_difficulte;
    }

    public void setEn_difficulte(boolean en_difficulte) {
        En_difficulte = en_difficulte;
    }

    public String getStade() {
        return stade;
    }

    public void setStade(String stade) {
        this.stade = stade;
    }

    public Date getDate_ajout() {
        return date_ajout;
    }

    public void setDate_ajout(Date date_ajout) {
        this.date_ajout = date_ajout;
    }

    public Date getDate_mise_ajour() {
        return date_mise_ajour;
    }

    public void setDate_mise_ajour(Date date_mise_ajour) {
        this.date_mise_ajour = date_mise_ajour;
    }

    public Date getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(Date datedebut) {
        this.datedebut = datedebut;
    }

    public Date getDatefin() {
        return datefin;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }

    public String getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(String difficulte) {
        this.difficulte = difficulte;
    }

    @Override
    public String toString() {
        return "Projet{" +
                "ref_projet=" + ref_projet +
                ", intitule='" + intitule + '\'' +
                ", cout=" + cout +
                ", En_difficulte=" + En_difficulte +
                ", stade='" + stade + '\'' +
                ", date_ajout=" + date_ajout +
                ", date_mise_ajour=" + date_mise_ajour +
                ", datedebut=" + datedebut +
                ", datefin=" + datefin +
                ", difficulte='" + difficulte + '\'' +
                '}';
    }
}


