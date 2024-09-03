import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(); 
		for(int i=1;i<=a;i++) {
			int b=s.nextInt(); 
			int c=s.nextInt();

			System.out.println("Case #"+i+": "+b+" + "+c+" = "+(b+c));
		}
		
	}

}