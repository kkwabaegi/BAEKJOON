import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] a=sc.next().split("");
        String[] b=sc.next().split("");
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            A.add(Integer.parseInt(a[i]));
        }
        for(int i=0;i<b.length;i++){
            B.add(Integer.parseInt(b[i]));
        }
        int n=((a.length>=b.length) ? a.length-1 : b.length-1);
        if(a.length>b.length){
            for(int i =0;i<a.length-b.length;i++){
                B.add(0,0);
            }
        }
        else if(b.length>a.length){
            for(int i =0;i<b.length-a.length;i++){
                A.add(0,0);
            }
        }
        
        int c=0;
        while(n>=0){
            result.add(0,(A.get(n)+B.get(n)+c)%10);
            c=(A.get(n)+B.get(n)+c)/10;
            n--;
        }
        if(c>0){
            result.add(0, c);
        }
        
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i));
        }

        sc.close();
    }
}