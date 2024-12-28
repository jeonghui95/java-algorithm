import sys
sys.stdin = open('./input.txt', 'r')
input = sys.stdin.readline


def merge_sort(num_list, p, q):
    if p < q:
        r = (p+q)//2
        merge_sort(num_list, p, r)
        merge_sort(num_list, r+1, q)
        merge(num_list, p, r, q)


def merge(num_list, p, r, q):
    temp = [0 for _ in range(len(num_list))]
    i, j, t = p, r+1, 0
    while (i <= p and j <= q):
        if num_list[i] <= num_list[j]:
            temp[t] = num_list[i]
            t, i = t+1, i+1
        else:
            temp[t] = num_list[j]
            t, j = t+1, j+1
    while (i <= p):
        temp[t] = num_list[i]
        t, i = t+1, i+1
    while (j <= q):
        temp[t] = num_list[j]
        t, j = t+1, j+1
    i, t = p, 0
    while (i <= q):
        num_list[i] = temp[t]
        i, t = i+1, t+1
    return num_list


n1, n2 = map(int, input().split())
num_list = list(map(int, input().split()))
print(merge_sort(num_list, 0, len(num_list)-1))



