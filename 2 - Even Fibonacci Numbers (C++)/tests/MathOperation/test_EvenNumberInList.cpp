#include "../../../res/catch2/catch.hpp"
#include "../../src/MathOperation/EvenNumberInList.hpp"

#include <vector>


TEST_CASE("Test_EvenNumberInList") {

	std::vector<int> emptyVector;
	std::vector<int> onlyEvenNumber{ 2, 4, 6, 12 };
	std::vector<int> onlyOddNumber{ 1, 3, 5, 11 };
	std::vector<int> mixNumber{ 1, 2, 3, 4, 11, 12 };

	SECTION("Empty vectori") {
		
		REQUIRE(getEvenNumber(emptyVector) == emptyVector);
	}

	SECTION("Only even number") {

		REQUIRE(getEvenNumber(onlyEvenNumber) == onlyEvenNumber);
	}

	SECTION("Only odd number") {

		REQUIRE(getEvenNumber(onlyOddNumber) == emptyVector);
	}

	SECTION("Mix number") {
		std::vector<int> evenNumber{ 2, 4, 12 };

		REQUIRE(getEvenNumber(mixNumber) == evenNumber);
	}

}