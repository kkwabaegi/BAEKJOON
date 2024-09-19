n = int(input())

print(' '*(n-1),end='')
print('*')
for i in range(1,n-1):
    print(' '*(n-1-i),end='')
    print('*',end='')
    print(' '*(i*2-1),end='')
    print('*')
if n != 1 : 
    print('*'*(n*2-1))