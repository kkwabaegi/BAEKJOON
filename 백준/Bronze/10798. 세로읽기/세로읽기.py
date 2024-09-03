Arr=[[] for i in range(5)]
for i in range(5):
    n=list(input())
    for j in range(len(n)):
        Arr[i].append(n[j])
for i in range(15):
    for j in range(5):
        if(len(Arr[j])<=i): continue
        print(Arr[j][i],end="")
