
'''

Starting in the top left corner of a 2x2 grid, 
and only being able to move to the right and down, 
there are exactly 6 routes to the bottom right corner.

How many such routes are there through a 20x20 grid?

 -  -
|  |  |
 -  -
|  |  |
 -  -

'''
def down():
    for x in xrange(1,20):
        return True



def step1(counter):
    for x in xrange(0,20):
        counter += 1
    return counter

def step2(counter, z, limit):
    if (z==limit):
        counter = counter + 1
        return counter
    else:
        counter = step2(counter, z+1, limit)

def fibonacci(number):
    if number == 0: return 0
    elif number == 1:
        return 1
    else:
        return fibonacci(number-1) + fibonacci(number-2)

def listsum(numList):
   if len(numList) == 1:
        return numList[0]
   else:
        return numList[0] + listsum(numList[1:])


def main():
    counter = 0
    limit = 3
    #counter = step1(counter)
    for linecount in xrange(1,limit):
        counter = counter + fibonacci(linecount)
    #     counter = step2(counter, linecount, limit)
    print counter
    print(listsum([1-21]))


if __name__ == '__main__':
    main()