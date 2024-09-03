int[] 체스말 = { 1, 1, 2, 2, 2, 8 };
int[] num = new int[6];
String[] 현제체스말 = Console.ReadLine().Split(" ");
for (int i = 0; i < 6; i++)
{
    num[i] = int.Parse(현제체스말[i]);
    Console.Write(체스말[i] - num[i] + " ");
}
