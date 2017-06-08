package com.wynnblevins.isprime.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class CommandLineInputService implements InputService {
	private Scanner scanner = new Scanner(System.in);
	
	@Override
	public Integer getInput(String promptString) {
		System.out.print(promptString);		
		Integer inputInt = null;
				
		try {
			String unparsedInput = scanner.nextLine();
			inputInt = Integer.parseInt(unparsedInput);
		}
		catch (NumberFormatException nfe) {
			nfe.printStackTrace();
			System.out.println("Unable to parse ");
		}
		
		return inputInt;
	}
}
