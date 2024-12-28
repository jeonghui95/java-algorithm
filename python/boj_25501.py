import sys
sys.stdin = open('./input.txt', 'r')
input = sys.stdin.readline


def palindrome(s, l, r):
    global cnt
    cnt += 1
    if l >= r:
        return 1
    elif s[l] != s[r]:
        return 0
    else:
        return palindrome(s, l+1, r-1)


def is_palindrome(s):
    return palindrome(s, 0, len(s)-1)


N = int(input())
for ii in range(N):
    S = input().strip()
    cnt = 0
    # print(is_palindrome(S))
    print(str(is_palindrome(S))+' '+str(cnt))
