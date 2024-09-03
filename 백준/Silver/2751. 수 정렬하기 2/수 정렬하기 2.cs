int num = int.Parse(Console.ReadLine());
int[] arr = new int[num];
for (int i = 0; i < num; i++)
{
    arr[i] = int.Parse(Console.ReadLine());
}
Array.Sort(arr);
Console.WriteLine(String.Join(" \n", arr));
