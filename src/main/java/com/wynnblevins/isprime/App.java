package com.wynnblevins.isprime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wynnblevins.isprime.service.InputService;
import com.wynnblevins.isprime.service.OutputService;
import com.wynnblevins.isprime.service.PrimeService;

@SpringBootApplication
public class App implements CommandLineRunner {
	@Autowired
	private PrimeService primeService;
	
	@Autowired
	private InputService inputService;
	
	@Autowired
	private OutputService outputService;
	
	@Override
	public void run(String... arg0) throws Exception {
		Long inputNumber = inputService.getInput("Enter a number> ");
		boolean isPrime = primeService.isPrime(inputNumber);
		outputService.printOutput(isPrime, inputNumber);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
