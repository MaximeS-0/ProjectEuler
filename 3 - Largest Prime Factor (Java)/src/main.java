import java.util.ArrayList;

import org.junit.experimental.theories.Theories;

import mathOperation.BiggestNumberOfList;
import mathOperation.PrimeFactor;

public class main {

	public static void main(String[] args) {

		long number = 600851475143L;
		ArrayList<Long> primeFactors = PrimeFactor.PrimeFactorOf(number);
		long biggestPrimeFactor = BiggestNumberOfList.biggestNumberOfAList(primeFactors);
		
		System.out.println("The largest prime factor of " + number + " is : " + biggestPrimeFactor);
	}

}
