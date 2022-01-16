n, k = map(int, input().split())
if k > n // 2:
    k = n - k

# sort the array, so that when processing ith number in a, we know a[i] is
# larger than or equal to previously processed numbers, so calculating abs
# is easier
a = sorted(map(int, input().split()))

# dp[i][j] is the value when ith number in a has already processed, and j of
# those numbers assigned to li, initialize all value to maximum number
dp = [[float('inf') for i in range(n + 1)] for j in range(n + 1)]

# When i==0, j==0, no number assigned, the value is zero
dp[0][0] = 0


for i in range(0, n):  # iter through a
    # iter through the possiblities of sizes in li when a[i] needs to be
    # assigned
    for j in range(0, i + 1):

        # We ignore the cases when the number of li or lu larger than required
        if j > k or i - j > n - k:
            continue

        # There are two possiblities: (1)assign a[i] to li (2) or to lu

        # Possiblity (1) assign to li:
        # If a[i] would be assigned to li:
        #       all the numbers in lu needs to be substracted from a[i],
        #       so we add (i -j)* a[i] to d[i][j].
        #       Note: substraction of all lu has been done in prevous steps
        #       (see below, 3 lines later)
        #       (i-j) is the current number in lu.
        #
        #       a[i] WILL be substracted from all future a[x] assigned to lu,
        #       so we substract (n - k - (i - j))*a[i] from d[i][j]
        #       (n-k): size of lu in the final step,
        #       (i-j): current number in lu
        #       (n-k -(i-j)): size of remaining numbers to be assigned to lu

        temp_li = dp[i][j] + a[i] * (i - j - (n - k - (i - j)))

        # Possiblity (2) assign to lu:
        # If a[i] would be assigned to lu:
        #       all the numbers in li needs to be substracted from a[i],
        #       so we add j* a[i] to d[i][j]
        #       Note: substraction of all lu has been done in prevous steps
        #       (see below, 2 lines later)
        #
        #       a[i] WILL be substracted from all future a[x] assigned to li,
        #       so we substract (k-j)*a[i] from d[i][j]
        #       (k-j) is the size of remaining numbers to be assigned to li
        temp_lu = dp[i][j] + a[i] * (j - (k - j))

        # Possiblity (1), both sizes of assigned numbers and li increment by 1
        if dp[i + 1][j + 1] > temp_li:
            dp[i + 1][j + 1] = temp_li

        # Possiblity (2), size of assigned numbers increment by 1, size of li
        # remains the same
        if dp[i + 1][j] > temp_lu:
            dp[i + 1][j] = temp_lu

print(dp[n][k])
