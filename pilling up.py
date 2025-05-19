# Enter your code here. Read input from STDIN. Print output to STDOUT

T = int(input())
for i in range(T):
    n = int(input())
    sideLength = list(map(int,input().strip().split()))
    code = False
    a = sideLength[0]
    b = sideLength[1]
    t = 2
    while t < n:
        c = sideLength[t]
        #print(f"a, b, c = {a}, {b}, {c}")
        if a < b and b > c:
            #print('masuk')
            code = True
            break
        t += 1
        a = b
        b = c
    print("No") if code else print("Yes")
