package com.example.projetpfe.Repository;

import com.example.projetpfe.entites.Projet;
import com.example.projetpfe.entites.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetReposiory extends JpaRepository<Projet,Long> {
	List<Projet> findByUser(User user);
}
