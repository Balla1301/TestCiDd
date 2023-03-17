package sn.zig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class CiCdTestApplication {
	
	@GetMapping("/bonjour")
	public String bonjour() {
		return "Hello ___";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(CiCdTestApplication.class, args);
	}

}
