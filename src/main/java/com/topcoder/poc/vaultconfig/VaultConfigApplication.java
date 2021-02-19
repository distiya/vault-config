package com.topcoder.poc.vaultconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class VaultConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaultConfigApplication.class, args);
	}

}
