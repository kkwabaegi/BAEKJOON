n=int(input())
num=input().split(" ")
sum=0
for i in range(n):
    s=0
    
    for j in range(2,int(num[i])):
        if(int(num[i])%j==0):
            s+=1
    if(int(num[i])>1 and s==0):
        sum+=1
print(sum)