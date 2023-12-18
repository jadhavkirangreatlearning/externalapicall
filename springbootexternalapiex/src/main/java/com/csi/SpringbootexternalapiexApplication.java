package com.csi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringbootexternalapiexApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootexternalapiexApplication.class, args);
	}

}
