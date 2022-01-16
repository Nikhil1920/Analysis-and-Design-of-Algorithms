n = int(input())
l = sorted(list(map(int, input().split())))
p, q = map(int, input().split())

if l[0] > q:
    print(p)
elif l[n - 1] < p:
    print(q)
else:
    ans = -1
    num = -1
    if l[0] > p:
        if ans < (l[0] - p):
            ans = (l[0] - p)
            num = p

    if l[n - 1] < q:
        if ans < (q - l[n - 1]):
            ans = (q - l[n - 1])
            num = q

    for i in range(n - 1):
        cur = (l[i] + l[i + 1]) // 2
        print("cur is ", cur)
        if cur <= q and cur >= p and (cur - l[i]) > ans:
            ans = (cur - l[i])
            num = cur
        elif cur > q:
            if (q - l[i]) > ans:
                ans = (q - l[i])
                num = q
        elif cur < p:
            if (l[i + 1] - p) > ans:
                ans = (l[i + 1] - p)
                num = p
    print(num)
