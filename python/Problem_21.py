'''
Created on 04.07.2014

Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a != b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.

'''

def count_amicable_numbers():
    numbers_and_divisor_sums = dict((x, get_divisors(x)) for x in range(0, 10001))
    print(sum([number for number, divisor_sum in numbers_and_divisor_sums.iteritems() if (number == numbers_and_divisor_sums.get(divisor_sum) and number != numbers_and_divisor_sums.get(number))]))

def get_divisors(number):
    limit = number / 2 + 1
    return sum([div_Test for div_Test in range(1,limit) if (number % div_Test) == 0])

if __name__ == '__main__':
    count_amicable_numbers()
