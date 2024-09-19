n = int(input())

print(' '*(n-1),end='')
print('*')
for i in range(n-1):
    print(' '*(n-2-i),end='')
    print('*',end='')
    print(' '*(i*2+1),end='')
    print('*')