
#include <iostream>
#include <vector>

#include "../src/Fibonacci/fibonacci.hpp"
#include "../src/MathOperation/EvenNumberInList.hpp"
#include "../src/MathOperation/SumNumberInList.hpp"




int main() {

	std::vector<int> fibonacci_under4Million = fibonacci(4000000);

	std::vector<int> fibonacci_evenNumber = getEvenNumber(fibonacci_under4Million);

	int sum = sumNumberIn(fibonacci_evenNumber);

	std::cout << "The sum of the even term of the Fibonacci sequence that does not exceed four million is : " << sum << std::endl;

}