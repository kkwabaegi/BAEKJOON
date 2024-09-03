Arr=[[0] for i in range(100)]
sum=0
for i in range(100):
    for j in range(100):
        Arr[i].append(0)

n=int(input())
for i in range(n):
    n=input().split(" ")
    for j in range(int(n[0]),int(n[0])+10):
        for k in range(int(n[1]),int(n[1])+10):
            Arr[j][k]=1

for i in range(100):
    for j in range(100):
        if(Arr[i][j]==1):
            sum+=1
print(sum)