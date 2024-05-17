import unittest

from src.mathOperation.numbersMultiples import getAllMultipleOf
from src.listOperation.mergeList import mergeListWithoutDuplicate

class Test_AllMultipleOf(unittest.TestCase):
    
    def test_exampleGiven(self):
        multipleOf3 = getAllMultipleOf(10, 3)
        multipleOf5 = getAllMultipleOf(10, 5)

        multipleOf3Or5 = mergeListWithoutDuplicate(multipleOf3, multipleOf5)

        self.assertEqual(multipleOf3Or5, [3,5,6,9])

        result = sum(multipleOf3Or5)

        self.assertEqual(result, 23)