
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String 승자="응애";
		int A=0;
		int B=0;
		int[]a=new int[10];
		int[]b=new int[10];
		for(int j=0;j<10;j++) {
			a[j]=s.nextInt();
		}
		for(int j=0;j<10;j++) {
			b[j]=s.nextInt();
		}
		for(int i=0;i<10;i++) {
			if(a[i]>b[i]) {
				A+=3;
				승자="A";
			}
			else if(b[i]>a[i]) {
				B+=3;
				승자="B";
			}
			else {
				A++;B++;
			}
		}
		System.out.println(A+" "+B);
		if(A>B) {
			System.out.println("A");
		}
		else if(B>A) {
			System.out.println("B");
		}
		else {
			if(승자=="응애") {
				System.out.println("D");
			}
			else {
				System.out.println(승자);
			}
		}
		
		
		
		
	}

}