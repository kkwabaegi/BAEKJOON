import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
			String in = sc.nextLine();
			if(in.equals("END")) {
				break;
			}
			String[] Str = in.split(" ");
		      for (int i = Str.length - 1; i >= 0; i--)
		      {
		          for (int k = 0; k < Str[i].length(); k++)
		          {
		              System.out.print(Str[i].charAt(Str[i].length() - 1 - k));
		          }
		          System.out.print(" ");
		      }
		      System.out.println();
		}

	}

}