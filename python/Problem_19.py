'''
Created on 03.07.2014



You are given the following information, but you may prefer to do some research for yourself.

    1 Jan 1900 was a Monday.
    Thirty days has September, April, June and November.
    All the rest have thirty-one,
    Saving February alone, Which has twenty-eight, rain or shine.
    And on leap years, twenty-nine.
    A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.

How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

'''

normal_years = [31,28,31,30,31,30,31,31,30,31,30,31]
leap_years = [31,29,31,30,31,30,31,31,30,31,30,31]
days = range(7)
days_written = ['So', 'Mo', 'Di', 'Mi', 'Do', 'Fr', 'Sa']
years = range(1901,2001)

def count_mondays():
    starting_day = predict_1_jan_1901()
    

def is_leap_year(year):
    if year % 400 == 0:
        return True
    if year % 100 == 0:
        return False
    if year % 4 == 0:
        return True
    return False
    
def predict_1_jan_1901():
    if is_leap_year(1900):
        year = leap_years
    else:
        year = normal_years
    day = sum(year) % 7
    print(year, sum(year))
    print(days_written[365%7])
    print(days_written[(day+1)%7])
    return days_written[(day+1)%7]
    

if __name__ == '__main__':
    count_mondays()
