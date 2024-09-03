import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int S=s.nextInt();
		int H=0;
		int W=0;
		int N=0;
		for(int i=0;i<S;i++){
			H=s.nextInt();
			W=s.nextInt();
			N=s.nextInt();
			if(N%H==0){
				System.out.printf("%d%02d\n",H,N/H);
			}
			else{
				System.out.printf("%d%02d\n",N%H,N/H+1);
			}
		}

	}

}