import java.util.*;
public class Main {
	public static int Z=0;
	public static int O=0;
	public static int[] N;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int 횟수=s.nextInt();
		int a=0;
		for(int i=0;i<횟수;i++) {
			a=s.nextInt();
			N=new int[a+1];
			fibonacci(a);
			if(a>=4) {
				Z++;
			}
			System.out.println(Z+" "+O);
			Z=0;
			O=0;
		}
		
	}
	public static int fibonacci(int n) {
	    if (n == 0) {
	    	Z++;
	        return 0;
	    } else if (n == 1) {
	    	O++;
	        return 1;
	    } 
	    else if(N[n]!=0){
	    	Z+=N[n-1];
	    	O+=N[n];
	    	return N[n];
	    }
	    else {
	        return N[n]=fibonacci(n-1) + fibonacci(n-2);
	    }
	}

}