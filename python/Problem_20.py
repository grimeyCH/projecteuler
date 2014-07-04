'''
Created on 04.07.2014

n! means n x (n - 1) x ... x 3 x 2 x 1

For example, 10! = 10 x 9 x ... x 3 x 2 x 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!


'''
from math import factorial

def count_factorial_digits():
    print(sum([int(char) for char in str(factorial(100))]))

if __name__ == '__main__':
    count_factorial_digits()
