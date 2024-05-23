#include <vector>

int sumNumberIn(std::vector<int> numberVector) {

	int sum = 0;

	for (size_t i = 0; i < numberVector.size(); i++)
	{
		sum += numberVector[i];
	}

	return sum;

}