import unittest

from src.listOperation.mergeList import mergeListWithoutDuplicate

class Test_AllMultipleOf(unittest.TestCase):

    def setUp(self):
        self.list1 = [1,3,4]
        self.list2 = [2,6,8,10]
        self.list3 = [1,2,3]
        self.emptyList = []

    def test_mergeList(self):
        self.assertEqual(mergeListWithoutDuplicate(self.list1, self.list2), [1,2,3,4,6,8,10])

    def test_mergeListWithDuplicate(self):
        self.assertEqual(mergeListWithoutDuplicate(self.list1, self.list3), [1,2,3,4])

    def test_mergeWithEmptyList(self):
        self.assertEqual(mergeListWithoutDuplicate(self.list1, self.emptyList), [1,3,4])

    def test_itemDuplicatedInList(self):
        self.assertEqual(mergeListWithoutDuplicate([1,1,1], self.emptyList), [1])
