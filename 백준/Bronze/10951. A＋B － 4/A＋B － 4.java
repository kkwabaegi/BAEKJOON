import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	int a=1;
    	int b=1;
    	while(s.hasNextInt()) {
        	a=s.nextInt();
        	b=s.nextInt();
        	System.out.println(a+b);
    	}
    }

}