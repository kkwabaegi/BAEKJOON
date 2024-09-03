import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	int a=s.nextInt();
    	int 작은수=s.nextInt();
    	int B[]=new int[a];
    	for(int i=0;i<a;i++) {
    		B[i]=s.nextInt();
    		if(B[i]<작은수) {
    			System.out.print(B[i]+" ");
    		}
    	}
    }

}
