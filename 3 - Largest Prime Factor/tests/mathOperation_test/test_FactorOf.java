package mathOperation_test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mathOperation.FactorOf;

class test_FactorOf {
	
	ArrayList<Integer> resultFactor;
	
	@BeforeEach
	void setUp() {
		resultFactor = new ArrayList<Integer>();
	}
	
	
	@Test
	void test_invalidNumber0() {
		assertThrows(ArithmeticException.class,() -> new FactorOf(0));
	}
	
	@Test
	void test_negativeNumber() {
		assertThrows(ArithmeticException.class,() -> new FactorOf(-1));
	}
	
	@Test
	void test_number1() {
		FactorOf number = new FactorOf(1);
		
		resultFactor.add(1);
		
		assertEquals(resultFactor, number.getFactor());
		assertFalse(number.isPrime());
	}
	
	@Test
	void test_number2() {
		FactorOf number = new FactorOf(2);
		
		resultFactor.add(1);
		resultFactor.add(2);
		
		assertEquals(resultFactor, number.getFactor());
		assertTrue(number.isPrime());
	}
	
	@Test
	void test_number4() {
		FactorOf number = new FactorOf(4);
		
		resultFactor.add(1);
		resultFactor.add(2);
		resultFactor.add(4);
		
		assertEquals(resultFactor, number.getFactor());
		assertFalse(number.isPrime());
	}
	
	@Test
	void test_number10() {
		FactorOf number = new FactorOf(10);
		
		resultFactor.add(1);
		resultFactor.add(2);
		resultFactor.add(5);
		resultFactor.add(10);
		
		assertEquals(resultFactor, number.getFactor());
		assertFalse(number.isPrime());
	}
	
	@Test
	void test_number13() {
		FactorOf number = new FactorOf(13);
		
		resultFactor.add(1);
		resultFactor.add(13);
		
		assertEquals(resultFactor, number.getFactor());
		assertTrue(number.isPrime());
	}

}
