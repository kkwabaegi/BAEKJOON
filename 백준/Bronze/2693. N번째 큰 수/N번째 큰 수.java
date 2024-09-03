import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int numm[]=new int[10];
		for(int i=0;i<num;i++) {
			for(int j=0;j<10;j++) {
				numm[j]=s.nextInt();
			}
			Arrays.sort(numm);
			System.out.println(numm[7]);
		}
	}

}