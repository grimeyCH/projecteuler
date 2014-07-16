'''


A perfect number is a number for which the sum of its proper divisors is exactly equal to the number.
For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.

A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.

As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24.
By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers.
However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.

Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.


'''

def calculate_sum_of_non_abundant_numbers():
    abundants = [number for number in range(1,28123) if is_abundant(number)]
    #print([number for number in abundants if number % 2 != 0])
    #non_abundants = [number for number in range(1,28123) if not is_abundant(number)]
    #print(sum([number for number in range(1,28123) if has_abundant_summands(number, abundants)]))
    sum = 0
    for number in range(1,28123):
        for summand1 in abundants:
            if summand1 >= number - 12:
                break
            if (number - summand1) in abundants:
                sum += number
                break
    print(sum)
    
def has_abundant_summands(number, abundants):
    for summand1 in abundants:
        if summand1 >= number - 12:
            return False
        if (number - summand1) in abundants:
            return True 

def is_abundant(number):
    if get_divisors(number) <= number:
        return False
    return True

def get_divisors(number):
    limit = number / 2 + 1
    return sum([div_Test for div_Test in range(1,limit) if (number % div_Test) == 0])

if __name__ == '__main__':
    calculate_sum_of_non_abundant_numbers()
    
