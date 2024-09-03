String[] N = Console.ReadLine().Split(" ");
int 올드비기준 = int.Parse(N[0]);
int 학년 = int.Parse(N[1]);
if (학년 <= 2)
{
    Console.WriteLine("NEWBIE!");
}
else if (학년 <= 올드비기준)
{
    Console.WriteLine("OLDBIE!");
}
else
{
    Console.WriteLine("TLE!");
}
