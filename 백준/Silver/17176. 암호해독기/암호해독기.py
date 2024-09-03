n = int(input())
str1 = input().split(' ')
pwd = []
dec = list(input())

for i in str1:
    if(i=='0'):
        pwd.append(' ')
        continue
    pwd.append(chr(int(i)+64) if(int(i)<27) else chr(int(i)+70))

print('y' if(sorted(pwd) == sorted(dec)) else 'n')