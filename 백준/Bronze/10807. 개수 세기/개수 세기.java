import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] Arr = new int[N];
        int hap=0;
        for(int i=0;i<N;i++){
            Arr[i]=s.nextInt();
        }
        int v=s.nextInt();
        for(int i=0;i<N;i++){
            if(Arr[i]==v){
                hap+=1;
            }
        }
        System.out.println(hap);
        s.close();
	}
}
