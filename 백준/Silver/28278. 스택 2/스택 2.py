import sys
import sys

input = sys.stdin.readline
print = sys.stdout.write

stack = []
index=-1
n = int(input())

for i in range(n):
    command = input().rstrip()
    if command.split(' ')[0] == '1':
        index += 1
        if len(stack)>index:
            stack[index] = command.split(' ')[1]
        else:
            stack += [command.split(' ')[1]]

    elif command == '2':
        if index==-1:
            print('-1\n')
        else:
            print(f'{stack[index]}\n')
            index-=1
    elif command == '3':
        print(f'{index+1}\n')
    elif command == '4':
        print('1\n' if index==-1 else '0\n')
    elif command == '5':
        print('-1\n' if index==-1 else f'{stack[index]}\n')