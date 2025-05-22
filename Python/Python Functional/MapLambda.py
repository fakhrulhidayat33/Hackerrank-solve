# Link: https://www.hackerrank.com/challenges/map-and-lambda-expression/problem?isFullScreen=true
# I start edit from here
cube = lambda x: x**3

def fibonacci(n):
    # return a list of fibonacci numbers
    a = 0; b = 1
    data = [a, b]
    for i in range(n-2):
        c = a + b
        data.append(c)
        a = b; b = c;
    return data
# until here        
if __name__ == '__main__':
    n = int(input())
    print(list(map(cube, fibonacci(n))))
