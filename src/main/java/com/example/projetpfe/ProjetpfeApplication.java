package com.example.projetpfe;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.example.projetpfe.Service.ProjetService;
import com.example.projetpfe.Service.UserService;
import com.example.projetpfe.entites.Projet;
import com.example.projetpfe.entites.User;

@SpringBootApplication
public class ProjetpfeApplication  implements CommandLineRunner{

	@Autowired
	UserService userService;
	
	@Autowired
	ProjetService projetService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetpfeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user1 = User.builder()
				.nom("Amaal")
				.prenom("neji")
				.email("iutoo.aa@oo.fr")
				.isAdmin(true)
				.motDePasse("bhjsdbjjhbeh")
				.telechone(445445L)
				.build();
		userService.SaveUser(user1);
		
		Projet projet =Projet.builder()
				.difficulte("dificile")
				.En_difficulte(false)
				.stade("Encours")
				.build();
		
		projetService.saveProjet(projet);
	}

}













