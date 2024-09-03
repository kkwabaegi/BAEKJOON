import java.util.*;
public class Main {

    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	int x=s.nextInt();
    	String[] a;
    	int hap=0;
    	int h=1;
    	for(int i=0;i<x;i++) {
    		a=s.next().split("");
    		for(int j=0;j<a.length;j++) {
    			if(a[j].equals("O")) {
    				hap+=h;
    				h++;
    			}
    			else {
    				h=1;
    			}
    		}
    		System.out.println(hap);
    		hap=0;
    		h=1;
    	}
    	
    }

}