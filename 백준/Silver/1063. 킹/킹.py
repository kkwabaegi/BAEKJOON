arr = [[False for j in range(8)] for i in range(8)]
# bool연산자 false로 (8, 8)2차원 배열 생성

str = input().split(" ") # king, stone, 반복횟수 받기(A1 A2 5)
arrKing = list(str[0]) # list(A1)    [A, 1]
arrStone = list(str[1])
king = [ord(arrKing[0])-65, int(arrKing[1])-1]
stone = [ord(arrStone[0])-65, int(arrStone[1])-1]


arr[stone[0]][stone[1]] = True # 킹의 위치를 체스판 배열의 True로 설정

for i in range(int(str[2])):
    command = input()    #  king 움직임
    if command == "R": # "R" 이면
        if king[0] == 7: # king의 위치가 오른쪽 끝인지 검사
            continue # 맞으면 continue
        if arr[king[0] + 1][king[1]]: # king이 오른쪽으로 간 위치에 돌이 있다면
            if stone[0] == 7: # 돌이 오른쪽 맨 끝인지 검사
                continue # 맞다면 continue
            else: 
                arr[stone[0]][stone[1]] = False # 아니라면 지금 돌의 위치는 False로
                stone[0] += 1 # 돌을 오른쪽으로 이동
                arr[stone[0]][stone[1]] = True # 옮긴 위치의 배열을 True로
        king[0] += 1 # 위에 과정에서 continue를 안밟았다면 킹의 위치를 오른쪽으로
    elif command == "L":
        if king[0] == 0:
            continue
        if arr[king[0] - 1][king[1]]:
            if stone[0] == 0:
                continue
            else:
                arr[stone[0]][stone[1]] = False
                stone[0] -= 1
                arr[stone[0]][stone[1]] = True
        king[0] -= 1
    elif command == "B":
        if king[1] == 0:
            continue
        if arr[king[0]][king[1] - 1]:
            if stone[1] == 0:
                continue
            else:
                arr[stone[0]][stone[1]] = False
                stone[1] -= 1
                arr[stone[0]][stone[1]] = True
        king[1] -= 1
    elif command == "T":
        if king[1] == 7:
            continue
        if arr[king[0]][king[1]+ 1]:
            if stone[1] == 7:
                continue
            else:
                arr[stone[0]][stone[1]] = False
                stone[1] += 1
                arr[stone[0]][stone[1]] = True
        king[1] += 1
    elif command == "RT":
        if king[0] == 7 or king[1] == 7:
            continue
        if arr[king[0] + 1][king[1] + 1]:
            if stone[0] == 7 or stone[1] == 7:
                continue
            else:
                arr[stone[0]][stone[1]] = False
                stone[0] += 1
                stone[1] += 1
                arr[stone[0]][stone[1]] = True
        king[0] += 1
        king[1] += 1
    elif command == "LT":
        if king[0] == 0 or king[1] == 7:
            continue
        if arr[king[0] - 1][king[1] + 1]:
            if stone[0] == 0 or stone[1] == 7:
                continue
            else:
                arr[stone[0]][stone[1]] = False
                stone[0] -= 1
                stone[1] += 1
                arr[stone[0]][stone[1]] = True
        king[0] -= 1
        king[1] += 1
    elif command == "RB":
        if king[0] == 7 or king[1] == 0:
            continue
        if arr[king[0] + 1][king[1] - 1]:
            if stone[0] == 7 or stone[1] == 0:
                continue
            else:
                arr[stone[0]][stone[1]] = False
                stone[0] += 1
                stone[1] -= 1
                arr[stone[0]][stone[1]] = True
        king[0] += 1
        king[1] -= 1
    elif command == "LB":
        if king[0] == 0 or king[1] == 0:
            continue
        if arr[king[0] - 1][king[1] - 1]:
            if stone[0] == 0 or stone[1] == 0:
                continue
            else:
                arr[stone[0]][stone[1]] = False
                stone[0] -= 1
                stone[1] -= 1
                arr[stone[0]][stone[1]] = True
        king[0] -= 1
        king[1] -= 1

king[0]=chr(king[0]+65)
stone[0]=chr(stone[0]+65)

print('%s%d' % (king[0], king[1]+1))
print('%s%d' % (stone[0],stone[1]+1))