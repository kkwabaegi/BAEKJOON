import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	int n=s.nextInt();
    	if(n<10) {
    		n*=10;
    	}
    	int a=n/10;
    	int b=n%10;
    	int c=a+b;
    	int count=0;
    	
    	
    	while(true) {
        	a=b;
        	b=c%10;
        	c=a+b;
        	count++;
        	if(n==a*10+b) {
        		break;
        	}
    	}
    	System.out.println(count);
    	
    	
    }

}