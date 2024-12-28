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
    i, j, k, m = p, r, q, 1
    while (i <= r and j <= q):
        if num_list[i] > num_list[j]:
            num_list[i],
        else:


n1, n2 = map(int, input().split())
num_list = list(map(int, input().split()))
print(merge_sort(num_list, 0, len(num_list)-1))
