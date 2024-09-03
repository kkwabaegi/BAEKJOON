import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String[] Num=s.next().split("");
        int hap=0;
        for(int i=0;i<N;i++){
            hap+=Integer.parseInt(Num[i]);
        }
        System.out.println(hap);
        s.close();
	}
}