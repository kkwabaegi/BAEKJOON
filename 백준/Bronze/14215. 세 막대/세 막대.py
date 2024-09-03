a, b, c=map(int, input().split())
n=[a,b,c]
n.sort()
if(n[0]+n[1]<=n[2]):
    n[2]=n[0]+n[1]-1
print(n[0]+n[1]+n[2])