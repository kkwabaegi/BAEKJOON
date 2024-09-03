t=int(input())
for i in range(t):
  money=int(input())
  print(money//25,end=" ")
  money=money%25
  print(money//10,end=" ")
  money=money%10
  print(money//5,end=" ")
  money=money%5
  print(money//1,end=" ")
  money=money%25
  print()
