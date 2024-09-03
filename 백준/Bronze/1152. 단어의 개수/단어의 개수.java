import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[] N=s.nextLine().split("");
        int hap=0;
        for(int i=0;i<N.length;i++){
            if(N[i].equals(" ")){
                hap++;
            }
        }
        hap++;
        if(N[0].equals(" ")){
            hap--;
        }
        if(N[N.length-1].equals(" ")){
            hap--;
        }
        System.out.println(hap);
	}
}