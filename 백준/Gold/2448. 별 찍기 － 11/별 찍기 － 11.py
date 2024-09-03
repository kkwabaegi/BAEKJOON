import sys, math

input = sys.stdin.readline
print = sys.stdout.write

def pyramid(i):
    if(i==0):
        print('  *   ')
    elif(i==1):
        print(' * *  ')
    else:
        print('***** ')

def gongback():
    print('   ')



m=int(input())//3
z=int(math.log2(m)-1)
c=True


for i in range(1,m+1):
    for j in range(3):
        for k in range(m-i):
            gongback()

        for k in range(i):
            c=True
            for b in range(z):
                if(not c):break
                if((i+pow(2,b)-1)%pow(2,b+1)>pow(2,b)-1 and k%pow(2,b+1)>pow(2,b)-1):
                    gongback()
                    gongback()
                    c=False
            if(c):
                pyramid(j)

        for k in range(m-i):
            gongback()
        print('\n')