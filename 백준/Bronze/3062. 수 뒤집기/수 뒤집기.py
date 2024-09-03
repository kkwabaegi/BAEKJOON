n = int(input())

def reverseNum(num):
    reverseNum = 0
    while(num != 0):
        reverseNum *= 10
        reverseNum += num % 10
        num //= 10
    return reverseNum

for i in range(n):
    num = int(input())
    sum = num+reverseNum(num)
    print("YES" if sum==reverseNum(sum) else "NO")
