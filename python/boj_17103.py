import sys
sys.stdin = open('./input.txt', 'r')
input = sys.stdin.readline


def find_goldbach(num):
    num_list = [0 for _ in range(num+1)]
    for ii in range(2, num//2+1):
        if num_list[ii] == 1:
            continue
        cnt = 2
        while True:
            if ii * cnt > num:
                break
            num_list[ii * cnt] = 1
            cnt += 1
    num_cnt = 0
    for ii in range(2, num//2+1):
        if num_list[ii] == 0 and num_list[num-ii] == 0:
            num_cnt += 1
    return num_cnt


N = int(input())

for ii in range(N):
    num = int(input())
    num = find_goldbach(num)
    print(num)
