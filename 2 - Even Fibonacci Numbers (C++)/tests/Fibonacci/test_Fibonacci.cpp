#include "../../../res/catch2/catch.hpp"
#include "../../src/Fibonacci/fibonacci.hpp"

#include <vector>

TEST_CASE("Test_Fibonnaci") {

	std::vector<int> emptyVector;
	std::vector<int> firstTerm{ 1 };
	std::vector<int> firstTwoTerms{ 1, 2 };
	std::vector<int> firstTenTerms{ 1, 2 , 3, 5, 8, 13, 21, 34, 55, 89 };

	SECTION("Empty fibonacci sequence") {
		std::vector<int> fibonacciSequence = fibonacci(1);

		REQUIRE(fibonacciSequence == emptyVector);
	}

	SECTION("First fibonacci term") {
		std::vector<int> fibonacciSequence = fibonacci(2);

		REQUIRE(fibonacciSequence == firstTerm);
	}

	SECTION("First two fibonacci term") {
		std::vector<int> fibonacciSequence = fibonacci(3);

		REQUIRE(fibonacciSequence == firstTwoTerms);
	}

	SECTION("First ten fibonacci term") {
		std::vector<int> fibonacciSequence = fibonacci(90);

		REQUIRE(fibonacciSequence == firstTenTerms);
	}

}