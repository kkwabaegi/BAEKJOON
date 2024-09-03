import java.util.*;
public class Main {

    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	int a[]=new int[10];
    	int x=0;
    	int count=0;
    	for(int i=0;i<10;i++) {
    		a[i]=s.nextInt();
    		a[i]=a[i]%42;
    		for(int j=0;j<i;j++) {
        		if(a[i]==a[j]) {
        			x++;
        		}
    		}
    		if(x==0) {
    			count++;
    		}
    		x=0;
    	}
    	System.out.println(count);
    	
    	
    }

}