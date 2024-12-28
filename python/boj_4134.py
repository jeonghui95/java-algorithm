import sys
sys.stdin = open('./input.txt', 'r')
input = sys.stdin.readline


def find_mind(num):
    while True:
        for ii in range(2, int(num**(1/2))+1):
            if num % ii == 0:
                break
            if ii == int(num**(1/2)) and num % ii != 0:
                return num
        num += 1


N = int(input())

for ii in range(N):
    num = int(input())
    if num <= 3:
        if num in [0, 1, 2]:
            print(2)
        elif num == 3:
            print(3)
    else:
        num = find_mind(num)
        print(num)
