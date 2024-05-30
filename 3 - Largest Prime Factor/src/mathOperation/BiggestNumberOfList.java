package mathOperation;

import java.util.ArrayList;

public class BiggestNumberOfList {
	
	static public int biggestNumberOfAList(ArrayList<Integer> numberList) {
		
		if (numberList == null) {
			throw new NullPointerException("No array");
		}
		
		if (numberList.isEmpty()) {
			throw new ArithmeticException("There is no number to compare");
		}
		
		
		int biggestNumber = numberList.get(0);
		
		for(int number: numberList) {
			if (number > biggestNumber) {
				biggestNumber = number;
			}
		}
		
		return biggestNumber;
	}
}
