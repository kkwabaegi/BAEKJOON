int[] N=new int[9];
int[] Nt=new int[9];
for (int i = 0; i < 9; i++)
{
    N[i] = int.Parse(Console.ReadLine());
    Nt[i] = N[i];
}
Array.Sort(N);
Console.WriteLine(N[8]);
for (int i = 1; i <= 9; i++)
{
    if (N[8] == Nt[i-1])
    {
        Console.WriteLine(i);
    }
}