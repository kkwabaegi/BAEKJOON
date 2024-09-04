from collections import deque

n = int(input())
balloons = list(map(int, input().split()))
q = deque(balloons)
result = deque([i for i in range(1, n+1)])

for i in range(n):
    rot = q.popleft()
    if rot>0:
        rot-=1
    q.rotate(-rot)
    zz=result.popleft()
    result.rotate(-rot)
    print(zz,end=' ')