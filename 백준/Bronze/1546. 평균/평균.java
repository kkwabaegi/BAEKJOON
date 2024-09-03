import java.util.*;
public class Main {

    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	int x=s.nextInt();
    	float a[]=new float[x];
    	float hap=0;
    	float H=0;
    	for(int i=0;i<x;i++) {
    		a[i]=s.nextInt();
    		if(a[i]>H){
    			H=a[i];
    		}
    	}
    	for(int i=0;i<x;i++) {
    		hap+=a[i]/H*100;
    	}
    	
    	System.out.println(hap/x);
    	
    }

}