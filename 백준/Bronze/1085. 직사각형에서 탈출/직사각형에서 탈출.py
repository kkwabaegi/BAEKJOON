a,b,c,d=map(int,input().split())
min=abs(a-c)
if(min>abs(b-d)):
    min=abs(b-d)
if(min>a):
    min=a
if(min>b):
    min=b
if(min>c):
    min=c
if(min>d):
    min=d
print(min)