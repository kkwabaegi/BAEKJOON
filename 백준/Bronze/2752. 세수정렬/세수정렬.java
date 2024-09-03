
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a<b&&a<c&&b<c) {
			System.out.println(a+" "+b+" "+c);
		}
		else if(a<b&&a<c&&c<b) {
			System.out.println(a+" "+c+" "+b);
		}
		else if(b<a&&b<c&&a<c) {
			System.out.println(b+" "+a+" "+c);
		}
		else if(b<a&&b<c&&c<a) {
			System.out.println(b+" "+c+" "+a);
		}
		else if(c<b&&c<a&&a<b) {
			System.out.println(c+" "+a+" "+b);
		}
		else if(c<b&&c<a&&b<a) {
			System.out.println(c+" "+b+" "+a);
		}

	}

}