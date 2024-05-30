package mathOperation;

import java.util.ArrayList;

public class PrimeFactor {

	
	static public ArrayList<Integer> PrimeFactorOf(int number) {
		if (number <= 0) {
			throw new ArithmeticException("Number should be bigger than 0");
		}
				
		return calcultePrimeFactor(number);
		
	}
	
		
	private static ArrayList<Integer> calcultePrimeFactor(int number_) {
		ArrayList<Integer> listOfFactor = new FactorOf(number_).getFactor();
		ArrayList<Integer> listOfPrimeFactor = new ArrayList<Integer>();
		
		for (int number: listOfFactor){
			if (new FactorOf(number).isPrime()) {
				listOfPrimeFactor.add(number);
			}
		}
		
		return listOfPrimeFactor;
	}
}
