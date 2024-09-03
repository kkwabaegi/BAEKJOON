import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	int a=1;
    	int b=1;
    	while(true) {
        	a=s.nextInt();
        	b=s.nextInt();
    		if(a==0&&b==0) {
    			break;
    		}
        	System.out.println(a+b);
    	}
    }

}