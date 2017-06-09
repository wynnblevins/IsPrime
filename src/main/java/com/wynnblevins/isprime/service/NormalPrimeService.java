package com.wynnblevins.isprime.service;

import org.springframework.stereotype.Service;

@Service
public class NormalPrimeService implements PrimeService {

	@Override
	public boolean isPrime(Long num) {
	    if (num < 2) 
	    	return false;
        if (num == 2) 
        	return true;
        if (num % 2 == 0) 
        	return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) 
            	return false;
        return true;
	}
	
}
