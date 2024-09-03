
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int Case=s.nextInt();
		int 오타자리 =0;
		String[] 오타;
		for(int i=0;i<Case;i++) {
			오타자리=s.nextInt();
			오타자리--;
			오타=s.next().split("");
			오타[오타자리]="";
			for(int k=0;k<오타.length;k++) {
				System.out.print(오타[k]);
			}
			System.out.println();
		}
	}

}
