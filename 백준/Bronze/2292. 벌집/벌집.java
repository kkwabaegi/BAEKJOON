import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int step=1;
        int a=1;
        int b=1;
		while(true) {
			if(N>a) {
				step++;
			}
			else {
				break;
			}
			a=(a/6+b)*6+1;
            b++;
		}
		System.out.println(step);
	}

}