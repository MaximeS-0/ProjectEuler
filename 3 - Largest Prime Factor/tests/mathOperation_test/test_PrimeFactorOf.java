package mathOperation_test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mathOperation.PrimeFactor;

class test_PrimeFactorOf {

	ArrayList<Long> resultFactor;
	ArrayList<Long> numbers;
	
	@BeforeEach
	void setUp() {
		numbers = new ArrayList<Long>();
		resultFactor = new ArrayList<Long>();
	}
	
	@Test
	void test_invalidNumber0() {
		assertThrows(ArithmeticException.class,() -> PrimeFactor.PrimeFactorOf(0));
	}
	
	@Test
	void test_negativeNumber() {
		assertThrows(ArithmeticException.class,() -> PrimeFactor.PrimeFactorOf(-1));
	}

	@Test
	void test_number1() {
		numbers = PrimeFactor.PrimeFactorOf(1);
		
		assertEquals(resultFactor, numbers);
	}
	
	@Test
	void test_number2() {
		numbers = PrimeFactor.PrimeFactorOf(2);
		
		resultFactor.add(2L);
		
		assertEquals(resultFactor, numbers);
	}
	
	@Test
	void test_number4() {
		numbers = PrimeFactor.PrimeFactorOf(2);
		
		resultFactor.add(2L);

		assertEquals(resultFactor, numbers);
	}
	
	@Test
	void test_number10() {
		numbers = PrimeFactor.PrimeFactorOf(10);
		
		resultFactor.add(2L);
		resultFactor.add(5L);
		
		assertEquals(resultFactor, numbers);
	}
	
	@Test
	void test_number13() {
		numbers = PrimeFactor.PrimeFactorOf(13);
		
		resultFactor.add(13L);
		
		assertEquals(resultFactor, numbers);
	}
	
}
