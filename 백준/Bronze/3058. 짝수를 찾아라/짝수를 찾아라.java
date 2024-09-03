
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int H=s.nextInt();
		int[] B=new int[7];
		int hap=0;
		int WN=100;
		for(int i=0;i<H;i++) {
			for(int j=0;j<7;j++) {
				B[j]=s.nextInt();
				if(B[j]%2==0) {
					hap+=B[j];
					if(WN>B[j]) {
						WN=B[j];
					}
				}
			}
			System.out.println(hap+" "+WN);
			WN=100;
			hap=0;
		}
		
	}

}