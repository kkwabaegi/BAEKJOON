n = int(input())

sum=0

dict = {'ChongChong':'ChongChong'}

for i in range(n):
    s=input().split(' ')
    if(dict.get(s[0])=='ChongChong'):
        dict[s[1]]='ChongChong'
    elif(dict.get(s[1])=='ChongChong'):
        dict[s[0]]='ChongChong'

for key in dict:
    sum+=1

print(sum)