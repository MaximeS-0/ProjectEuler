#include "../../../res/catch2/catch.hpp"
#include "../../src/MathOperation/SumNumberInList.hpp"

#include <vector>


TEST_CASE("Test_SumNumberInList") {

	std::vector<int> emptyVector;
	std::vector<int> onlyPositiveNumber{ 2, 4, 6, 12 };
	std::vector<int> onlyNegativeNumber{ -2, -4, -6, -12 };
	std::vector<int> mixNumber{ 1, -2, 3, -4, 11, -12 };

	SECTION("Empty vectori") {

		REQUIRE(sumNumberIn(emptyVector) == 0);
	}

	SECTION("Only even number") {

		REQUIRE(sumNumberIn(onlyPositiveNumber) == 24);
	}

	SECTION("Only odd number") {

		REQUIRE(sumNumberIn(onlyNegativeNumber) == -24);
	}

	SECTION("Mix number") {

		REQUIRE(sumNumberIn(mixNumber) == -3);
	}

}