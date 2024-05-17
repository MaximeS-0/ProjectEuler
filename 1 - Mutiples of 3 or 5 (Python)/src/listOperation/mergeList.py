
def mergeListWithoutDuplicate(list1: list, list2: list) -> list:

    #Casting the list into set
    #Set are used because they can't have duplicated items in them
    set1 = set(list1)
    set2 = set(list2)

    #Merging the two set
    setMerge = set1.union(set2)

    #Converting back into a list, and return the result
    return list(setMerge)
