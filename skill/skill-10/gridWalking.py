def gridWalking(m, x, D):
    MOD = 10 ** 9 + 7
    n = len(D)
    md = [[0 for _ in range(n + 1)] for _ in range(m + 1)]
    for i in range(n):
        M = [[0 for _ in range(m + 1)] for _ in range(D[i] + 1)]
        for j in range(1, D[i] + 1):
            M[j][0] = 1
        for j in range(1, m + 1):
            for k in range(1, D[i] + 1):
                M[k][j] = 0
                if k - 1 > 0:
                    M[k][j] = (M[k][j] + M[k - 1][j - 1]) % MOD
                if k + 1 <= D[i]:
                    M[k][j] = (M[k][j] + M[k + 1][j - 1]) % MOD
        md[0][i + 1] = 1
        for j in range(1, m + 1):
            md[j][i + 1] = M[x[i]][j]
    c = [[0 for _ in range(m + 1)] for _ in range(m + 1)]
    for i in range(m + 1):
        c[i][0] = 1
        c[i][i] = 1
    for i in range(1, m + 1):
        for j in range(1, i):
            c[i][j] = (c[i - 1][j - 1] + c[i - 1][j]) % MOD
    mdt = [[0 for _ in range(n + 1)] for _ in range(m + 1)]
    for i in range(m + 1):
        mdt[i][1] = md[i][1]
    for i in range(n + 1):
        mdt[0][i] = 1
    for i in range(2, n + 1):
        for j in range(1, m + 1):
            mdt[j][i] = 0
            for k in range(j + 1):
                mdt[j][i] = (
                    mdt[j][i] + ((c[j][j - k] * ((mdt[k][i - 1] * md[j - k][i]) % MOD)) % MOD)) % MOD
    return mdt[m][n]
