
#include <vector>
#include <assert.h>

std::vector<int> fibonacci(int maxValue) {

	//The max value should positive and non null
	assert (maxValue > 0);

	//Initial sequence is 1, 2
	std::vector<int> fibonacciSequence;
	if (maxValue == 1) { return fibonacciSequence; } //Empty sequence

	fibonacciSequence.push_back(1);
	if (maxValue == 2) { return fibonacciSequence; } //Only first value

	fibonacciSequence.push_back(2);
	if (maxValue == 3) { return fibonacciSequence; } //Only first 2 values


	while(fibonacciSequence.back() < maxValue){

		int size = fibonacciSequence.size();
		fibonacciSequence.push_back(fibonacciSequence[size - 2] + fibonacciSequence[size - 1]);

	}

	//The sequence generated always exceed by one number
	fibonacciSequence.pop_back();

	return fibonacciSequence;
}