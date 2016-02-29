#!/usr/bin/env python3
# -*- coding: utf-8 -*-

from math import pow
from math import ceil

#O(n ^ log 3)
def karatsuba(int1, int2):
    if int1 < 10 or int2 < 10:
        return int1 * int2

    # here we try to get the values of a,b,c,d
    string1 = str(int1)
    string2 = str(int2)
    m = max(len(string1), len(string2))
    middle = int(m/2)
    a,b = int(string1[:-middle]), int(string1[-middle:])
    c,d = int(string2[:-middle]), int(string2[-middle:])

    #do karatsuba multiplication here
    ac = karatsuba(a,c)
    bd = karatsuba(b,d)

    # (a+b)(c+d) = j
    j = karatsuba(a+b, c+d)
    ad_and_bc = j - ac - bd

    if m % 2 == 1:
        m -= 1
    result = ac * int(pow(10, m)) + bd + ad_and_bc * int(pow(10, middle))

    return result

if __name__ == '__main__':
    print("this program does calculate if one number is equal to or less than half of the other number of digits")
    int1 = int(input("Number 1:"))
    int2 = int(input("Number 2:"))
    print(karatsuba (int1, int2))
