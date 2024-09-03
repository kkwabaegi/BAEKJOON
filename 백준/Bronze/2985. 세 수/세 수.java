import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a+b==c) {
			System.out.println(a+"+"+b+"="+c);
		}
		else if(a-b==c) {
			System.out.println(a+"-"+b+"="+c);
		}
		else if(a*b==c) {
			System.out.println(a+"*"+b+"="+c);
		}
		else if(a/b==c) {
			System.out.println(a+"/"+b+"="+c);
		}
		else if(a==b+c) {
			System.out.println(a+"="+b+"+"+c);
		}
		else if(a==b-c) {
			System.out.println(a+"="+b+"-"+c);
		}
		else if(a==b*c) {
			System.out.println(a+"="+b+"*"+c);
		}
		else if(a==b/c) {
			System.out.println(a+"="+b+"/"+c);
		}

	}

}