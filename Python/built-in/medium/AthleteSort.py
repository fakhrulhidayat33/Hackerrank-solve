#!/bin/python3

# I make these code by modified from "https://www.geeksforgeeks.org/bubble-sort-algorithm/"
# with add "index" as the indicator for sorting the list
# from here
def bubbleSort(arr, index):
    n = len(arr)
    
    # Traverse through all array elements
    for i in range(n):
        swapped = False

        # Last i elements are already in place
        for j in range(0, n-i-1):

            # Traverse the array from 0 to n-i-1
            # Swap if the element found is greater
            # than the next element
            if arr[j][index] > arr[j+1][index]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
                swapped = True
        if (swapped == False):
            break

#until here

if __name__ == '__main__':
    nm = input().split()
    n = int(nm[0])
    m = int(nm[1])
    arr = []

    for _ in range(n):
        arr.append(list(map(int, input().rstrip().split())))
    
    k = int(input())
    quickSort(arr, 0, n - 1, k)
    
    for i in arr:
        tst = str(i).strip("[]").replace(",", "")
        print(tst)
        #print(" ".join(i))
