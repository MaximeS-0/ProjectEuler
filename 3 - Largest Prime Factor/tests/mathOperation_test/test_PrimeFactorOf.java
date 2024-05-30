package mathOperation_test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mathOperation.PrimeFactorOf;

class test_PrimeFactorOf {

	ArrayList<Integer> resultFactor;
	
	@BeforeEach
	void setUp() {
		resultFactor = new ArrayList<Integer>();
	}
	
	@Test
	void test_invalidNumber0() {
		assertThrows(ArithmeticException.class,() -> new PrimeFactorOf(0));
	}
	
	@Test
	void test_negativeNumber() {
		assertThrows(ArithmeticException.class,() -> new PrimeFactorOf(-1));
	}

	@Test
	void test_number1() {
		PrimeFactorOf number = new PrimeFactorOf(1);
		
		assertEquals(resultFactor, number.getPrimeFactor());
	}
	
	@Test
	void test_number2() {
		PrimeFactorOf number = new PrimeFactorOf(2);
		
		resultFactor.add(2);
		
		assertEquals(resultFactor, number.getPrimeFactor());
	}
	
	@Test
	void test_number4() {
		PrimeFactorOf number = new PrimeFactorOf(2);
		
		resultFactor.add(2);

		assertEquals(resultFactor, number.getPrimeFactor());
	}
	
	@Test
	void test_number10() {
		PrimeFactorOf number = new PrimeFactorOf(10);
		
		resultFactor.add(2);
		resultFactor.add(5);
		
		assertEquals(resultFactor, number.getPrimeFactor());
	}
	
	@Test
	void test_number13() {
		PrimeFactorOf number = new PrimeFactorOf(13);
		
		resultFactor.add(13);
		
		assertEquals(resultFactor, number.getPrimeFactor());
	}
	
}
