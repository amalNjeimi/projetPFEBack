package com.example.projetpfe.entites;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String nomUtilisateur;
	String motDePasse;
	Boolean isActif;
	Boolean isChefProjet;
	Boolean isAdmin;
	Boolean issupprimer;
	Date datenaissance;
	Long telechone;
	String nom;
	String prenom;
	String email;
	//@JsonIgnore
	@OneToMany(mappedBy = "user")
	List<Projet> projets;
	@OneToOne
	Profil profil;

}
