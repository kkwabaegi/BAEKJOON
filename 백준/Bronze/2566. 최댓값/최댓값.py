Arr=[[] for i in range(9)]
Max=-1
x=0
y=0
for i in range(9):
    n=input().split(" ")
    for j in range(9):
        Arr[i].append(int(n[j]))
        if(int(n[j])>Max):
            Max=int(n[j])
            x=i+1
            y=j+1

print(Max)
print(x, y)