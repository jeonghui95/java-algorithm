import sys
sys.stdin = open('./input.txt', 'r')
input = sys.stdin.readline


def find_mind(num):
    num_list = [0 for _ in range(num*2+1)]
    for ii in range(2, num):
        if num_list[ii] == 1:
            continue
        hae = 1
        while True:
            if ii*hae >= len(num_list):
                break
            num_list[(hae*ii)] = 1
            hae += 1
    cnt = 0
    for ii in range(num+1, num*2+1):
        if num_list[ii] == 0:
            cnt += 1
    return cnt


while True:
    num = int(input())
    if num == 0:
        break
    if num == 2:
        print(1)
    else:
        num = find_mind(num)
        print(num)
