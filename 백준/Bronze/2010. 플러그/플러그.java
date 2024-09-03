
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();			
		int x=0;
		int y=1;
		for(int a=1;a<=num;a++) {		
			x=s.nextInt();					
			y=y+(x-1);						
		}									
		System.out.println(y);
			
	}

}