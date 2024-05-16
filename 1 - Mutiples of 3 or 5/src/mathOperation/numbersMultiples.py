
def getAllMultipleOf(number: int, multiple: int) -> [int]:

    #Input must be integer
    assert type(number) == int
    assert type(multiple) == int

    assert number >= 0 # Can't be negative 
    assert multiple > 0 #Can't be negative nor null

    AllNumberMultipleOf = []

    for i in range(1, number):
        if (i % multiple == 0):
            AllNumberMultipleOf.append(i)

    return AllNumberMultipleOf
