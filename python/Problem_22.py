'''


Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 x 53 = 49714.

What is the total of all the name scores in the file?


'''
import string

def calculate_name_scores():
    names_array = read_names_file()
    sorted_names = sorted(names_array)
    print(sum([(names_array.get(sorted_names[num]) * (num+1)) for num in range(0,len(names_array))]))

def read_names_file():
    alphabet_values = dict((string.ascii_uppercase[value], value+1) for value in range(26))
    return dict((name.strip('\"'), sum(alphabet_values[char] for char in name.strip('\"'))) for line in file('names.txt') for name in line.split(','))

if __name__ == '__main__':
    calculate_name_scores()