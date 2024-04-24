package br.edu.eteczl.catracasbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CatracasbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatracasbackendApplication.class, args);
	}
   
	@GetMapping("/consultara")
	public String consultara(@RequestParam(value = "ra", defaultValue = "0") int ra) {
		if (ra == 24439) {
			return String.format("O RA:  %05d corresponde à Luís Fellipe da Silva Araújo",ra);	
		}
		else {
			return "RA não encontrado.";
		}

	}
}
