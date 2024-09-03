String str = Console.ReadLine();
String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
String abc = "abcdefghijklmnopqrstuvwxyz";
int num = 26;
int[] arr = new int[num];
int b = 0;
int c = 0;
for(int i = 0; i < str.Length; i++)
{
    for(int j = 0; j < 26; j++)
    {
        if (str[i].Equals(ABC[j]))
        {
            arr[j] += 1;
        }
        if (str[i].Equals(abc[j]))
        {
            arr[j] += 1;
        }
        if (arr[j] > b)
        {
            b = arr[j];
        }
    }
}
for (int k = 0; k < 26; k++)
{
    if (b == arr[k])
    {
        c += 1;
    }
}
    if (c != 1)
    {
        Console.WriteLine("?");
    }
    else
    {
    for (int i = 0; i < 26; i++)
    {
        if (b == arr[i])
        {
            Console.WriteLine(ABC[i]);
        }
    }
}