
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int cut=s.nextInt();
		int numm[]=new int[num];
		for(int i=0;i<num;i++) {
			numm[i]=s.nextInt();
		}
		Arrays.sort(numm);
		System.out.println(numm[num-cut]);
	}

}