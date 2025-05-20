#only learn about zip

# Enter your code here. Read input from STDIN. Print output to STDOUT

m, n = map(int, input().split())

arr = [list(map(float, input().split())) for _ in range(n)]

process = zip(*arr)

result = [sum(i)/n for i in process]

for i in result: print (i) 
