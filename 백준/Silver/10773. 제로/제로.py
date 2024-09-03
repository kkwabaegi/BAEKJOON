arr = []
k = int(input())
for i in range(k):
    n = int(input())
    if(n==0):
        arr.pop()
    else:
        arr.append(n)

hap=0
for i in range(len(arr)):
    hap+=arr[i]
print(hap)