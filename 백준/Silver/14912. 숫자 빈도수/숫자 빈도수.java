
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		String 빈도수=s.next();
		int 빈도=0;
		String[] N스;
		for(int i=1;i<=N;i++) {
			N스=Integer.toString(i).split("");
			for(int j=0;j<N스.length;j++) {
				if(N스[j].equals(빈도수)) {
					빈도++;
				}
			}
		}
		System.out.println(빈도);

	}

}