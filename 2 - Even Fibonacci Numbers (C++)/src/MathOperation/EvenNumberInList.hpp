#ifndef EVEN_NUMBER_IN_LIST_H
#define EVEN_NUMBER_IN_LIST_H

#include <vector>

std::vector<int> getEvenNumber(std::vector<int> numberVector) {

	std::vector<int> evenNumberVector;

	for (size_t i = 0; i < numberVector.size(); i++)
	{
		if (numberVector[i] % 2 == 0)
		{
			evenNumberVector.push_back(numberVector[i]);
		}
	}

	return evenNumberVector;

}


#endif