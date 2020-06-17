package com.epam.vaultdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VaultDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaultDemoApplication.class, args);
	}

	@Value("${vault:user}")
	private String user;

	@RequestMapping("")
	public String hello(){
		return String.format("Hello %s!", user);
	}
}
