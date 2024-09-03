import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int 총가격=s.nextInt();
		int h=s.nextInt();
		int a=0;
		int b=0;
		int hap=0;
		for(int i=1;i<=h;i++) {
			a=s.nextInt();
			b=s.nextInt();
			hap+=a*b;
		}
		if(총가격==hap) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}