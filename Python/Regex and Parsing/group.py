# Link: https://www.hackerrank.com/challenges/re-group-groups/problem?isFullScreen=true

# Enter your code here. Read input from STDIN. Print output to STDOUT

import re
m = re.findall(r'([a-zA-Z-0-9]){1}\1+', input())
if len(m) == 0:
    print(-1)
else:
    print(m[0])
