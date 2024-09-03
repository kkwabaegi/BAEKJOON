m=input().split(" ")
a=int(m[0])
b=int(m[1])
arr1=[[] for i in range(a)]
arr2=[[] for i in range(a)]
for i in range(a):
    n=input().split(" ")
    for j in range(b):
        arr1[i].append(n[j])
    

for i in range(a):
    n=input().split(" ")
    for j in range(b):
        arr2[i].append(n[j])

for i in range(a):
    for j in range(b):
        print(int(arr1[i][j])+int(arr2[i][j]),end=" ")
    print()