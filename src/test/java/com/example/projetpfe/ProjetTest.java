package com.example.projetpfe;

import com.example.projetpfe.Repository.ProjetReposiory;
import com.example.projetpfe.entites.Projet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class ProjetTest {
    @Autowired
    ProjetReposiory projetRep;

    @Test
    void contextLoads() {
    }

    @Test
    public void testCreateProjet() {
        Projet prod = new Projet("projet cni",12354,false,"fin",new Date(),new Date(),new Date(),new Date(),
                "oui diff");
        projetRep.save(prod);
    }

    @Test
    public void testFindProjet()
    {
        Projet p = projetRep.findById(1L).get();

    }
    @Test
    public void testUpdateProjet() {
        Projet p = projetRep.findById(1L).get();
        p.setEn_difficulte(true);
        projetRep.save(p);
        System.out.println(p);

    }
    @Test
    public void testDeleteProjet()
    {
        projetRep.deleteById(1L);
    }
    @Test
    public void testFindAllProjets()
    {
        List<Projet> prods = projetRep.findAll();

        for (Projet p:prods)
            System.out.println(p);

    }



}
