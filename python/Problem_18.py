'''
By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

3
7 4
2 4 6
8 5 9 3

That is, 3 + 7 + 4 + 9 = 23.

Find the maximum total from top to bottom of the triangle below:

75
95 64
17 47 82
18 35 87 10
20 04 82 47 65
19 01 23 75 03 34
88 02 77 73 07 63 67
99 65 04 28 06 16 70 92
41 41 26 56 83 40 80 70 33
41 48 72 33 47 32 37 16 94 29
53 71 44 65 25 43 91 52 97 51 14
70 11 33 28 77 73 17 78 39 68 17 57
91 71 52 38 17 14 91 43 58 50 27 29 48
63 66 04 68 89 53 67 30 73 16 69 87 40 31
04 62 98 27 23 09 70 98 73 93 38 53 60 04 23


'''
test = (
    (75),
    (95, 64),
    (17, 47, 82),
    (18, 35, 87, 10),
    (20, 04, 82, 47, 65),
    (19, 01, 23, 75, 03, 34),
    (88, 02, 77, 73, 07, 63, 67),
    (99, 65, 04, 28, 06, 16, 70, 92),
    (41, 41, 26, 56, 83, 40, 80, 70, 33),
    (41, 48, 72, 33, 47, 32, 37, 16, 94, 29),
    (53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14),
    (70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57),
    (91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48),
    (63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31),
    (04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23)
    )

def nextHighest(currLine, currIndex):
    nextPeer1 = test[currLine+1][currIndex]
    nextPeer2 = test[currLine+1][currIndex+1]
    if nextPeer1 >= nextPeer2:
        print(nextPeer1)
        return (currIndex, nextPeer1)
    print(nextPeer2)
    return (currIndex+1, nextPeer2)

def main():
    currLine = 0
    maxTotal = 0
    currIndex = 0
    nextMax = 0
    for line in test:
        if currLine == 0:
            maxTotal = line
            currIndex, nextMax = nextHighest(currLine, 0)
            currLine += 1
        else:
            try:
                currIndex, nextMax = nextHighest(currLine, currIndex)
            except:
                print('end',maxTotal)
            currLine += 1
        maxTotal += nextMax
        print(maxTotal)

    


if __name__ == '__main__':
    print(__doc__)
    main()