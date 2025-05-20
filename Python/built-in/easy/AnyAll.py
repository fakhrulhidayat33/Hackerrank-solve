# Enter your code here. Read input from STDIN. Print output to STDOUT

n = int(input())

arr = list(input().split())

if all([number[0] != "-" for number in arr]):
    if any([number == number[::-1] for number in arr]):
        print (True)
