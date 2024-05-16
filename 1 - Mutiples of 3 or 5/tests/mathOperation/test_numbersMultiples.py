import unittest

from src.mathOperation.numbersMultiples import getAllMultipleOf

class Test_AllMultipleOf(unittest.TestCase):

    def test_gettingAllMultiple(self):
        self.assertEqual(getAllMultipleOf(10, 3), [3, 6, 9])

    def test_getMultipleOf0(self):
        self.assertEqual(getAllMultipleOf(0, 3) , [])

    def test_multipleBiggerThanNumber(self):
        self.assertEqual(getAllMultipleOf(5, 10), [])

    def test_multipleOfNegativeNumber(self):
        with self.assertRaises(AssertionError):
            getAllMultipleOf(-1, 2)

    def test_multipleNegative(self):
        with self.assertRaises(AssertionError):
            getAllMultipleOf(3, -1)

    def test_numberNotInteger(self):
        with self.assertRaises(AssertionError):
            getAllMultipleOf(0.3, -1)

    def test_multipleNotInteger(self):
        with self.assertRaises(AssertionError):
            getAllMultipleOf(2, 0.2)
