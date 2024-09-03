s=input().split(" ")
N = [0 for i in range(int(s[0]))]
M=int(s[0])
R=int(s[1])

for i in range(M):
    N[i]=i+1

for i in range(R):
    Q=input().split(" ")
    A=int(Q[0])-1#시작
    B=int(Q[1])-1#끝
    C=int(Q[2])-1#기준
    D=[]
    
    for j in range(M-(B+1)):
        D.append(N[B+1+j])

    for j in range(M-(B+1)):
        del N[B+1]

    for j in range(A,C):
        N.append(N[A])
        del N[A]

    for j in range(len(D)):
        N.append(D[j])

for i in range(M):
    print(N[i],end=" ")