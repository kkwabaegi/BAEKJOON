import java.util.*;
public class Main {
	static int[] A=new int[10036];
	public static void main(String[] args) {
		for(int i=1;i<=10000;i++) {
			A[SN(i)]=1;
		}
		for(int i=1;i<=10000;i++) {
			if(A[i]!=1) {
				System.out.println(i);
			}
		}
	}
	public static int SN(int a) {
		int s=a;
		s+=s/1000+s/100%10+s/10%10+s%10;
		return s;
	}
    
}