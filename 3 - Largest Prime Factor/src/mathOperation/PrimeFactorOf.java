package mathOperation;

import java.util.ArrayList;

public class PrimeFactorOf {

	private int number;
	private ArrayList<Integer> primeFactorList;
	
	
	public PrimeFactorOf(int number_) {
		if (number_ <= 0) {
			throw new ArithmeticException("Number should be bigger than 0");
		}
		
		number = number_;
		primeFactorList = new ArrayList<Integer>();
		
		calcultePrimeFactor();
		
	}
	
	
	public int getNumber() {
		return number;
	}
	
	public ArrayList<Integer> getPrimeFactor(){
		return primeFactorList;
	}
	
	
	private void calcultePrimeFactor() {
		ArrayList<Integer> listOfFactor = new FactorOf(number).getFactor();
		
		for (int number: listOfFactor){
			if (new FactorOf(number).isPrime()) {
				primeFactorList.add(number);
			}
		}
	}
}
