#only learn about using exec

# Enter your code here. Read input from STDIN. Print output to STDOUT

n, p = [int(x) for x in input().split()]
data = input()

exec(f"def func({data[0]}): return {data}")

print(func(n) == p)
