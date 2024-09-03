n=input().split(" ")

dap = [0 for i in range(int(n[0]))]
w=int(n[1])

for i in range(w):
    asdf=input().split(" ")
    a=int(asdf[0])
    b=int(asdf[1])
    c=int(asdf[2])

    for j in range(a-1, b):
        dap[j]=c

for i in range(int(n[0])):
    print(dap[i], end=" ")