a1,b1=map(int,input().split())
a2,b2=map(int,input().split())
a3,b3=map(int,input().split())

a=0
if(a1==a2):
    a=a3
elif(a1==a3):
    a=a2
elif(a2==a3):
    a=a1

b=0
if(b1==b2):
    b=b3
elif(b1==b3):
    b=b2
elif(b2==b3):
    b=b1

print(a,b)