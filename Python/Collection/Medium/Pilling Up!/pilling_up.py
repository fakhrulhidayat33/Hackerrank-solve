# Enter your code here. Read input from STDIN. Print output to STDOUT

T = int(input())
for i in range(T):
    n = int(input())
    sideLength = list(map(int,input().strip().split()))
    code = False
    prev = sideLength[0]
    curr = sideLength[1]
    t = 2
    while t < n:
        next = sideLength[t]
        if prev < curr and curr > next:
            code = True
            break
        t += 1
        prev = curr
        curr = next
    print("No") if code else print("Yes")
