import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] Arr = new int[31];
        int N=0;
        for(int i=0;i<28;i++){
            N=s.nextInt();
            Arr[N]=1;
        }
        for(int i=1;i<=30;i++){
            if(Arr[i]!=1){
                System.out.println(i);
            }
        }
        s.close();
	}
}