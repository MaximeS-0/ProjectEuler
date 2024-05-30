package mathOperation_test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mathOperation.BiggestNumberOfList;
import mathOperation.FactorOf;

class test_BiggestNumberOfList {

	ArrayList<Integer> numberList;
	int result;
	
	
	
	@BeforeEach
	void setUp() {
		numberList = new ArrayList<Integer>();
		result = 0;
	}
	
	@Test
	void nullException() {
		assertThrows(NullPointerException.class,() -> BiggestNumberOfList.biggestNumberOfAList(null));
	}
	
	@Test
	void emptyNumberList() {
		assertThrows(ArithmeticException.class,() -> BiggestNumberOfList.biggestNumberOfAList(numberList));
	}
	
	@Test
	void oneNumber() {
		numberList.add(1);
		
		result = BiggestNumberOfList.biggestNumberOfAList(numberList);
		assertEquals(result, 1);
	}
	
	@Test
	void multipleNumber() {
		numberList.add(5);
		numberList.add(8);
		numberList.add(3);
		
		result = BiggestNumberOfList.biggestNumberOfAList(numberList);
		assertEquals(result, 8);
	}
	
	@Test
	void negativeNumber() {
		numberList.add(-5);
		numberList.add(-8);
		numberList.add(-3);
		
		result = BiggestNumberOfList.biggestNumberOfAList(numberList);
		assertEquals(result, -3);
	}

	
	@Test
	void mixNumber() {
		numberList.add(5);
		numberList.add(-8);
		numberList.add(-3);
		
		result = BiggestNumberOfList.biggestNumberOfAList(numberList);
		assertEquals(result, 5);
	}
}
