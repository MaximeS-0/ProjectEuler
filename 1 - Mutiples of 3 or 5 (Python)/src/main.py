
from mathOperation.numbersMultiples import getAllMultipleOf
from listOperation.mergeList import mergeListWithoutDuplicate

testingNumber = 1000

multipleOf3 = getAllMultipleOf(testingNumber, 3)
multipleOf5 = getAllMultipleOf(testingNumber, 5)

multipleOf3Or5 = mergeListWithoutDuplicate(multipleOf3, multipleOf5)

result = sum(multipleOf3Or5)

print("The sum of all the multiple of 3 and 5 below ", testingNumber, " is ", result)