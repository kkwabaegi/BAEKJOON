s=input().split(" ")
N = [0 for i in range(int(s[0]))]
M=int(s[1])

for i in range(int(s[0])):
    N[i]=i+1

for i in range(M):
    Q=input().split(" ")
    A=int(Q[0])-1
    B=int(Q[1])-1

    for j in range((B-A+1)//2):
        N[A+j],N[B-j]=N[B-j],N[A+j]

for i in range(int(s[0])):
    print(N[i], end=" ")
