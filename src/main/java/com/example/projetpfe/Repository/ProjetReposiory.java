package com.example.projetpfe.Repository;

import com.example.projetpfe.entites.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetReposiory extends JpaRepository<Projet,Long> {
}
