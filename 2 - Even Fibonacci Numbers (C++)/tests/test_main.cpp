#define CATCH_CONFIG_MAIN
#include "../../res/catch2/catch.hpp"

#include "../src/Fibonacci/fibonacci.hpp"
#include "../src/MathOperation/EvenNumberInList.hpp"
#include "../src/MathOperation/SumNumberInList.hpp"

#include <vector>


TEST_CASE("Test_solution") {

	std::vector<int> firstTenNumber{ 1,2,3,5,8,13,21,34,55,89 };
	std::vector<int> filterEvenNumber{ 2, 8, 34 };
	int sum = 44;


	std::vector<int> fibonacci_10First = fibonacci(100);
	REQUIRE(fibonacci_10First == firstTenNumber);

	std::vector<int> fibonacci_evenNumber = getEvenNumber(fibonacci_10First);
	REQUIRE(fibonacci_evenNumber == filterEvenNumber);

	int sumOfList = sumNumberIn(fibonacci_evenNumber);
	REQUIRE(sumOfList == sum);

}