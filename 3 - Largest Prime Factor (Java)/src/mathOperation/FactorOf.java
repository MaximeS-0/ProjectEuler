package mathOperation;


import java.util.ArrayList;

public class FactorOf {

	private long number;
	private ArrayList<Long> factorList;
	private boolean isPrime_;
	
	
	public FactorOf(long number_) {
		if (number_ <= 0) {
			throw new ArithmeticException("Number should be bigger than 0");
		}
		
		number = number_;
		factorList = new ArrayList<Long>();
		
		calculatePrimeFactor();
		calculateIfPrime();
	}
	
	
	
	public long getNumber() {
		return number;
	}
	
	public ArrayList<Long> getFactor(){
		return factorList;
	}
	
	public boolean isPrime() {
		return isPrime_;
	}
	
	
	private void calculatePrimeFactor() {
		calculateFirstHalfOfFactor();
		calculateSecondHalfOfFactor();
	}
	
	private void calculateFirstHalfOfFactor() {
		
		for(long i = 1; i<= Math.sqrt(number); i++ ){
			
			if (number % i == 0) {
				factorList.add(i);
			}
		}
	}
	
	private void calculateSecondHalfOfFactor() {
		
		//The last factor already found could be there 2 times with this technique
		//ex. with the number 4
		//First half :  1, 2
		//Second half : 2, 4
		
		long middleFactor = factorList.get(factorList.size() - 1);
		
		int numberOfiteration = factorList.size();//Need to be outside the loop, because the factorList size change with each iteration
		
		for (int i = 0; i < numberOfiteration; i++) {
			
			int index = numberOfiteration-1 - i; //Use to keep the number in order
			
			long reciprocalFactor = number / factorList.get(index);
			
			if (reciprocalFactor != middleFactor) {
				factorList.add(reciprocalFactor);
			}
				
			
		}
	}
	
	private void calculateIfPrime() {
		//If a number is prime, there should be only 2 factor : itself and 1
		if (factorList.size() == 2) {
			isPrime_ = true;
		}
		
		else isPrime_ = false;
	}
	
	
}
