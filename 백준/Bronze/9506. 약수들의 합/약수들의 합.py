while(True):
    sum=0
    n=int(input())
    if(n==-1):
        break

    for i in range(1, n):
        if(n%i==0):
            sum+=i


    if(n==sum):
        print(n, "= ",end="")
        for i in range(1,n):
            if(n//2==i):
                print(i)
            elif(n%i==0):
                print(i,"+ ", end="")

            
    else:
        print(n, "is NOT perfect.")
