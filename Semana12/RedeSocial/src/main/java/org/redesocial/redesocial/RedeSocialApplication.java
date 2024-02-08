package org.redesocial.redesocial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RedeSocialApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedeSocialApplication.class, args);

	}
	@GetMapping("/hello")

	public String firstProgram(@RequestParam(value = "myName", defaultValue = "DESGRAÇAAAAA") String name) {
		return String.format("Hello %s!", name);
	}
}
