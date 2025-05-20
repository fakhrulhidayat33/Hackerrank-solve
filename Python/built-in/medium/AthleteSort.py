#!/bin/python3

import math
import os
import random
import re
import sys

# I make these code by modified from "https://www.geeksforgeeks.org/quick-sort-algorithm/"
# with add "index" as the indicator for sort list
# from here
# Partition function
def partition(arr, low, high, index):
    
    # Choose the pivot
    pivot = arr[high][index]
    
    # Index of smaller element and indicates 
    # the right position of pivot found so far
    i = low - 1
    
    # Traverse arr[low..high] and move all smaller
    # elements to the left side. Elements from low to 
    # i are smaller after every iteration
    for j in range(low, high):
        if arr[j][index] < pivot:
            i += 1
            swap(arr, i, j)
    
    # Move pivot after smaller elements and
    # return its position
    swap(arr, i + 1, high)
    return i + 1

# Swap function
def swap(arr, i, j):
    arr[i], arr[j] = arr[j], arr[i]

# The QuickSort function implementation
def quickSort(arr, low, high, index):
    if low < high:
        
        # pi is the partition return index of pivot
        pi = partition(arr, low, high, index)
        
        # Recursion calls for smaller elements
        # and greater or equals elements
        quickSort(arr, low, pi - 1, index)
        quickSort(arr, pi + 1, high, index)

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
