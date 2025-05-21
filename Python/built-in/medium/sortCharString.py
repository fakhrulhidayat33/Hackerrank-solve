# Link:
# https://www.hackerrank.com/challenges/ginorts/problem?isFullScreen=true

# Enter your code here. Read input from STDIN. Print output to STDOUT
List = list(map(ord, list(input())))

w = W = N1 = N2 = []
for i in List:
    if i in range(49, 58, 2): N1.append(i)
    elif i in range(48, 57, 2): N2.append(i)
    elif i in range(65, 91): W.append(i)
    elif i in range(97, 123): w.append(i)

w.sort(); W.sort(); N1.sort(); N2.sort();

String = ''
for i in w + W + N1 + N2: String += chr(i)
print(String)
