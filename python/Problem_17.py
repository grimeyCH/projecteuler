'''
Created on 27.05.2014

If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.

'''

def main():

    numbers = "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred", "thousand"
    oneToNine = "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    tens = "","ten","twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    teens = "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    And = "and"
    hundred = "hundred"
    onethousand = len("onethousand")
    summe1 = 0
    
    counter = 0
    
    for hundreds in oneToNine:
        for ten in tens:
            if ten == "ten":
                for specialT in teens:
                    if len(hundreds) > 0:
                        print(hundreds, "hundred","and",specialT)
                        counter = counter + len(hundreds) + len("hundredand") + len(specialT)
                    else:
                        print(specialT)
                        counter = counter + len(specialT)
            else:
                for ones in oneToNine:
                    if len(ten) == 0 and len(ones) == 0 and len(hundreds) > 0:
                        print(hundreds, "hundred")
                        counter = counter + len(hundreds) + len("hundred")
                    elif len(hundreds) > 0:
                        print(hundreds, "hundred","and",ten,ones)
                        counter = counter + len(hundreds) + len("hundredand") + len(ten) + len(ones)
                    else:
                        print(ten,ones)
                        counter = counter + len(ten) + len(ones)
    
    counter = counter + onethousand
    print(counter)

if __name__ == '__main__':
    main()
