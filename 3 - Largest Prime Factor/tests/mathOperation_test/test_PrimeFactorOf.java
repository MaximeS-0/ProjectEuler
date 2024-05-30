package mathOperation_test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mathOperation.PrimeFactor;

class test_PrimeFactorOf {

	ArrayList<Integer> resultFactor;
	ArrayList<Integer> numbers;
	
	@BeforeEach
	void setUp() {
		numbers = new ArrayList<Integer>();
		resultFactor = new ArrayList<Integer>();
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
		
		resultFactor.add(2);
		
		assertEquals(resultFactor, numbers);
	}
	
	@Test
	void test_number4() {
		numbers = PrimeFactor.PrimeFactorOf(2);
		
		resultFactor.add(2);

		assertEquals(resultFactor, numbers);
	}
	
	@Test
	void test_number10() {
		numbers = PrimeFactor.PrimeFactorOf(10);
		
		resultFactor.add(2);
		resultFactor.add(5);
		
		assertEquals(resultFactor, numbers);
	}
	
	@Test
	void test_number13() {
		numbers = PrimeFactor.PrimeFactorOf(13);
		
		resultFactor.add(13);
		
		assertEquals(resultFactor, numbers);
	}
	
}
