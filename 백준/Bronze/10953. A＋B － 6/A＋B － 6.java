import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String v=s.nextLine();
		int i=Integer.parseInt(v);
		for(int n=0;n<i;n++) {
			String[] str=s.nextLine().split("");
			int a=Integer.parseInt(str[0]);
			int b=Integer.parseInt(str[2]);
			System.out.println(a+b);
		}
	}

}
