package com.deployspring.deployspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DeployspringApplication {

	@GetMapping("/hellomukesh")
	 public String helloMukesh(){

		     String st="Hi Mukesh, Good Morning";
		     return  st;

	      }

	public static void main(String[] args) {
		SpringApplication.run(DeployspringApplication.class, args);
	}

}
