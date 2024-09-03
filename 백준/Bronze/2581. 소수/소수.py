a=int(input())
b=int(input())

sum=0
min=100000
for i in range(a,b+1):
    if(i==1):
        continue
    count=0
    for j in range(2, i):
        if(i%j==0):
            count+=1
    if(count==0):
        sum+=i
        if(min>i):
            min=i
if(sum==0):
    print(-1)
else:
    print(sum)
    print(min)