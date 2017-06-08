package com.wynnblevins.isprime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wynnblevins.isprime.service.InputService;
import com.wynnblevins.isprime.service.PrimeService;

@SpringBootApplication
public class App implements CommandLineRunner {
	@Autowired
	private PrimeService primeService;
	
	@Autowired
	private InputService inputService;
	
	@Override
	public void run(String... arg0) throws Exception {
		Integer inputInteger = inputService.getInput("Enter a number> ");
		
		if (primeService.isPrime(inputInteger)) {
			System.out.println(inputInteger + " is Prime.");
		} else {
			System.out.println(inputInteger + " isn't Prime.");
		}
	}
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
