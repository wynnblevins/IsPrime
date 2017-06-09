package com.wynnblevins.isprime.service;

import org.springframework.stereotype.Service;

@Service
public class NormalPrimeService implements PrimeService {

	@Override
	public boolean isPrime(Long num) {
	    // numbers less than two do not count as prime
		if (num < 2) 
	    	return false;
        
		// two is a prime number
		if (num == 2) 
        	return true;
        
		// if the number is even it then it can't be prime
		if (num % 2 == 0) 
        	return false;
        
		// starting at three, 
		// while i * i is less than the number we're checking against
		// increment the number by 2 
		for (int i = 3; i * i <= num; i += 2) {
            
			// then check if the number is divisible by 1 
			if (num % i == 0) 
            	return false;
		}
		
        return true;
	}
	
}
