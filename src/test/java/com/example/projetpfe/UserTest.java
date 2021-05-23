package com.example.projetpfe;

import com.example.projetpfe.Repository.ProjetReposiory;
import com.example.projetpfe.Repository.UserRepository;
import com.example.projetpfe.entites.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {
    @Autowired
    UserRepository userRep;
    @Test
    void contextLoads() {
    }
    @Test
void testNomUtiliateur(){
        User U = userRep.findByNomUtilisateur("admin");
        System.out.println(U);
    }

}
