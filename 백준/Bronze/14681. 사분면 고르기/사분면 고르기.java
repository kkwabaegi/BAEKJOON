
import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int A=s.nextInt();
		int B=s.nextInt();
		if(A>0&&B>0) {
			System.out.println("1");
		}
		else if(A<0&&B>0){
			System.out.println("2");
		}
		else if(A<0&&B<0){
			System.out.println("3");
		}
		else {
			System.out.println("4");
		}

	}

}
