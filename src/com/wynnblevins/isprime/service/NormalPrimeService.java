package com.wynnblevins.isprime.service;

public class NormalPrimeService implements PrimeService {

	@Override
	public boolean isPrime(int number) {
		if (number % 2 == 0) return false;
		if (number == 2) return true;	
		for (int i = 3; i * i <= number; i += 2)
            if (number % i == 0) return false;
        
        return true;
	}
	
}
