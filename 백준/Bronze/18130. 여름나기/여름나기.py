import sys

n, m = map(int, sys.stdin.readline().rstrip().split(' '))
addcost=0

minnum = 1
min = 0

for i in range(n):
    addcost=0
    a, b, c = map(int, sys.stdin.readline().rstrip().split(' '))
    
    addcost+=((m-1)//b)*(((m-1)//b)+1)//2*c


    if(i==0 or min>a+addcost):
        min=a+addcost
        minnum=i+1
        
sys.stdout.write("%d %d" %(minnum, min))