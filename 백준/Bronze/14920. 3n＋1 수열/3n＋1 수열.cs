
int count=0;
int num = int.Parse(Console.ReadLine());
    while (true)
    {
        if (num == 1)
        {
            count++;
            break;
        }
        if (num % 2 == 0)
        {
            num = num / 2;
            count++;
        }
        else if(num % 2 == 1)
        {
            num = num * 3 + 1;
            count++;
        }
    }
    Console.WriteLine(count);
    
