package mathOperation;

import java.util.ArrayList;

public class BiggestNumberOfList {
	
	static public Long biggestNumberOfAList(ArrayList<Long> numberList) {
		
		if (numberList == null) {
			throw new NullPointerException("No array");
		}
		
		if (numberList.isEmpty()) {
			throw new ArithmeticException("There is no number to compare");
		}
		
		
		Long biggestNumber = numberList.get(0);
		
		for(long number: numberList) {
			if (number > biggestNumber) {
				biggestNumber = number;
			}
		}
		
		return biggestNumber;
	}
}
