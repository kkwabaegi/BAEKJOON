a=int(input())

while(True):
    if(a==1):
        break
    count=True
    for i in range(2, a):
        if(a%i==0):
            count = False
            break
    if(count):
        print(a)
        break
    
    for i in range(2, a//2+2):
        count=True
        for j in range(2, i):
            if(i%j==0):
                count=False
                break
        if(count and a%i==0):
            a//=i
            print(i)
            break
