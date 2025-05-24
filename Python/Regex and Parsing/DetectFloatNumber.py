# Link: https://www.hackerrank.com/challenges/introduction-to-regex/problem?isFullScreen=true

import re
r = r"^[+-]?\d*\.\d+$"
for i in range(int(input())):
    print(True if re.match(r, input()) else False)
