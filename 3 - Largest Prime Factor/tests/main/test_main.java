package main;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import mathOperation.BiggestNumberOfList;
import mathOperation.FactorOf;
import mathOperation.PrimeFactor;

class test_main {

	@Test
	void test_solution_Factor() {
		
		FactorOf factors = new FactorOf(13195);
		
		ArrayList<Long> resultFactor = new ArrayList<Long>();
		resultFactor.add(1L);
		resultFactor.add(5L);
		resultFactor.add(7L);
		resultFactor.add(13L);
		resultFactor.add(29L);
		resultFactor.add(35L);
		resultFactor.add(65L);
		resultFactor.add(91L);
		resultFactor.add(145L);
		resultFactor.add(203L);
		resultFactor.add(377L);
		resultFactor.add(455L);
		resultFactor.add(1015L);
		resultFactor.add(1885L);
		resultFactor.add(2639L);
		resultFactor.add(13195L);
		
		assertEquals(resultFactor, factors.getFactor());
	}


	@Test
	void test_solution_PrimeFactor() {
		
		ArrayList<Long> primeFactors = PrimeFactor.PrimeFactorOf(13195);
		
		ArrayList<Long> resultPrimeFactor = new ArrayList<Long>();
		resultPrimeFactor.add(5L);
		resultPrimeFactor.add(7L);
		resultPrimeFactor.add(13L);
		resultPrimeFactor.add(29L);

		
		assertEquals(resultPrimeFactor, primeFactors);
	}
	
	@Test
	void test_solution_BiggestPrimeFactor() {
		
		ArrayList<Long> primeFactors = PrimeFactor.PrimeFactorOf(13195L);
		long biggestNumber = BiggestNumberOfList.biggestNumberOfAList(primeFactors);
		
		assertEquals(biggestNumber, 29);
		
	}
	
}
