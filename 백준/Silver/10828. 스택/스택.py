import sys
n = int(sys.stdin.readline())
arr = []
for i in range(n):
    order = sys.stdin.readline().rstrip()
    if(order.split(' ')[0]=='push'):
        arr.append(order.split(' ')[1])
    elif(order=='pop'):
        if(len(arr)==0):
            print(-1)
        else:
            print(arr.pop())
    elif(order=='size'):
        print(len(arr))
    elif(order=='empty'):
        if(len(arr)==0):
            print(1)
        else:
            print(0)
    elif(order=='top'):
        if(len(arr)==0):
            print(-1)
        else:
            print(arr[-1])