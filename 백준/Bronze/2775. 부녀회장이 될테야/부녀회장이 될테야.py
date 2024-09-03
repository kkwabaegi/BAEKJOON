n=int(input())

for i in range(n):
    a=int(input())
    b=int(input())
    x=[i for i  in range(1,b+1)]
    for i in range(a):
        for j in range(b):
            if(j==0):continue
            x[j] = x[j]+x[j-1]
    print(x[b-1])
