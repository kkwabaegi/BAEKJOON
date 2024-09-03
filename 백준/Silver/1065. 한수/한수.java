import java.util.*;
public class Main {
	static int[] A=new int[1000];
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int hap=0;
		int b=s.nextInt();
		for(int i=1;i<=b;i++) {
			hap+=SN(i);
		}
		System.out.println(hap);
	}
	public static int SN(int a) {
		if(a<100) {
			return 1;
		}
		else {
			if((a/100)-(a/10%10)==(a/10%10)-(a%10)) {
				return 1;
			}
			return 0;
		}
	}
    
}