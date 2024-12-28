from collections import deque
import sys
sys.stdin = open('./input.txt', 'r')
input = sys.stdin.readline

n1 = int(input())
seq_list = list(map(int, input().split()))
queuestack = list(map(int, input().split()))
n2 = int(input())
insert_list = deque(map(int, input().split()))
new_deque = deque()
for ii in range(n1):
    if seq_list[ii] == 0:
        new_deque.append(queuestack[ii])
for _ in range(n2):
    init_num = insert_list.popleft()
    new_deque.appendleft(init_num)
    print(new_deque.pop(), end=' ')
# for _ in range(n2):
#     init_num = insert_list.popleft()
#     for ii in range(n1):
#         if seq_list[ii] == 0:
#             queuestack[ii], init_num = init_num, queuestack[ii]
    # print(init_num, end=' ')
