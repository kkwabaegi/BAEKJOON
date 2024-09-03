import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for(int i=0;i<N;i++){
            int R=s.nextInt();
            String[] Num=s.next().split("");
            for(int j=0;j<Num.length;j++){
                for(int k=0;k<R;k++){
                    System.out.print(Num[j]);
                }
            }
            System.out.println();
        }
        s.close();
	}
}

