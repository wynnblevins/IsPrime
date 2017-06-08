package com.wynnblevins.isprime;

import java.util.Scanner;

import com.wynnblevins.isprime.service.NormalPrimeService;
import com.wynnblevins.isprime.service.PrimeService;

public class App {
	private static Integer promptForInput() {
		Scanner reader = new Scanner(System.in);		
		System.out.print("Please enter an integer: ");		 
		Integer n = reader.nextInt();
		return n;
	}
	
	public static void main(String[] args) {
		PrimeService primeService = new NormalPrimeService();
		Integer inputInteger = promptForInput();
		
		if (primeService.isPrime(inputInteger)) {
			System.out.println(inputInteger + " is Prime.");
		} else {
			System.out.println(inputInteger + " isn't Prime.");
		}
	}
}
