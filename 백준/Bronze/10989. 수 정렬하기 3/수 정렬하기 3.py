import sys
H=int(sys.stdin.readline())
MAX=0

N=[0 for i in range(10000)]
for i in range(H):
    A=int(sys.stdin.readline())
    N[A-1]+=1
    if(A>MAX):
        MAX=A

for i in range(MAX):
    for j in range(N[i]):
        print(i+1)