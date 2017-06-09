package com.wynnblevins.isprime.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class CommandLineInputService implements InputService {
	private Scanner scanner = new Scanner(System.in);
	
	@Override
	public Long getInput(String promptString) {
		System.out.print(promptString);		
		Long inputLong = null;
				
		try {
			String unparsedInput = scanner.nextLine();
			inputLong = Long.parseLong(unparsedInput);
		}
		catch (NumberFormatException nfe) {
			nfe.printStackTrace();
			System.out.println("Unable to parse ");
		}
		
		return inputLong;
	}
}
