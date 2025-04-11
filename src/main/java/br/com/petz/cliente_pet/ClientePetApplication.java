package br.com.petz.cliente_pet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClientePetApplication {
	@GetMapping
	public String getHomeTeste() {
		return "Cliente Pet - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientePetApplication.class, args);

		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Ana");
		nomes.add("Justicia");
		nomes.add("Carlos");

		for(String nome:nomes){
			System.out.println(nome);
		}

		}
	}

