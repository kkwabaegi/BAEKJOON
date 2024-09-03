a = int(input())
b=0
cnt=0
while(b<a):
    if(b==0):
        b+=1
    else:
        b+=b
    cnt+=1
print(cnt)