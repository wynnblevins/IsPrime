package com.wynnblevins.isprime.service;

import org.springframework.stereotype.Service;

@Service
public class IsPrimeOutputService implements OutputService {
	private String formattingString = "----------------";
	
	@Override
	public void printOutput(boolean isPrime, Long number) {
		if (isPrime) {
			System.out.println(formattingString);
			System.out.println(number + " is prime.");
			System.out.println(formattingString);
		}
		else {
			System.out.println(formattingString);
			System.out.println(number + " isn't prime.");
			System.out.println(formattingString);
		}
	}
}
