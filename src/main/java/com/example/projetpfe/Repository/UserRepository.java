package com.example.projetpfe.Repository;


import com.example.projetpfe.entites.Projet;
import com.example.projetpfe.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByNomUtilisateur (String nomUtilisateur);

    @Query(value="SELECT p.* from projet_users pu , projet p " +
            "WHERE p.ref_projet = pu.projets_ref_projet and pu.users_utilisateur_id = ?"
            ,nativeQuery=true)

    public List<Projet> findProjectsByUser(Long utilisateur_id);
}
