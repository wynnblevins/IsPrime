package com.wynnblevins.isprime;

import com.wynnblevins.isprime.service.NormalPrimeService;
import com.wynnblevins.isprime.service.PrimeService;

public class App {
	private static Integer parseIntArg(String[] args) {
		Integer numberArg = null;
		
		if (args.length > 0) {
			try {
				numberArg = Integer.parseInt(args[0]);
			}
			catch (NumberFormatException nfe) {
				nfe.printStackTrace();
				System.exit(1);
			} 
		} 
		
		return numberArg;
	}
	
	public static void main(String[] args) {
		PrimeService primeService = new NormalPrimeService();
		Integer inputInteger = parseIntArg(args);		
		
		if (primeService.isPrime(inputInteger)) {
			System.out.println(inputInteger + " is Prime.");
		} else {
			System.out.println(inputInteger + " isn't Prime.");
		}
	}
}
