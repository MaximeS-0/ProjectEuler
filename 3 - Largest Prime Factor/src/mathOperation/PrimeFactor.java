package mathOperation;

import java.util.ArrayList;

public class PrimeFactor {

	
	static public ArrayList<Long> PrimeFactorOf(long number) {
		if (number <= 0) {
			throw new ArithmeticException("Number should be bigger than 0");
		}
				
		return calcultePrimeFactor(number);
		
	}
	
		
	private static ArrayList<Long> calcultePrimeFactor(long number_) {
		ArrayList<Long> listOfFactor = new FactorOf(number_).getFactor();
		ArrayList<Long> listOfPrimeFactor = new ArrayList<Long>();
		
		for (long number: listOfFactor){
			if (new FactorOf(number).isPrime()) {
				listOfPrimeFactor.add(number);
			}
		}
		
		return listOfPrimeFactor;
	}
}
