String[] str = Console.ReadLine().Split(" ");
int h = Int32.Parse(str[0]);
int m = Int32.Parse(str[1]);
		if(h==0&&m<45)																
			Console.WriteLine(23+" "+(60-(45-m)));
		else if(m<45)																
			Console.WriteLine((h-1)+" "+(60-(45-m)));
		else																			
			Console.WriteLine(h+" "+(m-45));