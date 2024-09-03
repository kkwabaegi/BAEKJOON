import sys
w, h = map(int, sys.stdin.readline().rstrip().split(' '))#맵 크기
x, y = map(int, sys.stdin.readline().rstrip().split(' '))
time = int(sys.stdin.readline().rstrip())

if(((x+time) // w ) % 2==0):
    rx = (x+time) % w
else:
    rx = w-((x+time) % w)

if(((y+time) // h ) % 2==0):
    ry = (y+time) % h
else:
    ry = h-((y+time) % h)

sys.stdout.write("%d %d" %(rx, ry))