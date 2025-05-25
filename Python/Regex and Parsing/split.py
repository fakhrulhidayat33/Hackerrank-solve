# Link: https://www.hackerrank.com/challenges/re-split/problem?isFullScreen=true

regex_pattern = r"[,.]"	# Do not delete 'r'. [I only can edit this line]

import re
print("\n".join(re.split(regex_pattern, input())))
