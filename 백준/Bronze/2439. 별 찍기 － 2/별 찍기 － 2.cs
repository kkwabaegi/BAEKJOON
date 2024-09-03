
int num = int.Parse(Console.ReadLine());
for(int i = 1; i <= num; i++)
{
    for(int j = 0; j < num-i; j++)
    {
        Console.Write(" ");
    }
    for (int k = 0; k < i; k++)
    {
        Console.Write("*");
    }
    Console.WriteLine();
}
