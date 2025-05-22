# Link: https://www.hackerrank.com/challenges/map-and-lambda-expression/problem?isFullScreen=true
# I start editing from here
cube = lambda x: x**3

def fibonacci(n):
    # return a list of fibonacci numbers
    a = 0; b = 1
    data = []
    for i in range(n):
        data.append(a)
        c = a + b; a = b; b = c;
    return data
# until here        
if __name__ == '__main__':
    n = int(input())
    print(list(map(cube, fibonacci(n))))
