n = int(input())

sum=0

dict = {}

for i in range(n):
    s=input()
    if(s=='ENTER'):
        dict.clear()
    elif(dict.get(s,True)):
        sum+=1
        dict[s]=False
        
print(sum)

