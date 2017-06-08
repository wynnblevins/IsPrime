package com.wynnblevins.isprime.service;

import org.springframework.stereotype.Service;

@Service
public class NormalPrimeService implements PrimeService {

	@Override
	public boolean isPrime(int number) {
		if (number == 2) return true;	
		if (number % 2 == 0) return false;
		for (int i = 3; i * i <= number; i += 2)
            if (number % i == 0) return false;
        
        return true;
	}
	
}
