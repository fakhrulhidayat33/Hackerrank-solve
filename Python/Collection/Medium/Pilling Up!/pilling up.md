#pilling up insight

I recognized that any local peak (a < b > c) makes stacking impossible,
so I scan once to detect that pattern in O(n) time.
This taught me to look for:
- minimal ‘obstruction patterns’ in a sequence, and
- maintain a constant extra state.
