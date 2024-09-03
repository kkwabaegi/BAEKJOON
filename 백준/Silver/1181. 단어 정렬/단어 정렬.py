num = int(input())

arr=[]
for i in range(num):
    arr.append(input())

arr.sort()
arr.sort(key=len)

print(arr[0])
for i in range(1,num):
    if(arr[i]!=arr[i-1]):
        print(arr[i])