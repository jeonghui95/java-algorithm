import sys
sys.stdin = open('./input.txt', 'r')
input = sys.stdin.readline


def factorial(num):
    if num > 0:
        return num * factorial(num-1)
    else:
        return 1


intnum = int(input())
print(factorial(intnum))
