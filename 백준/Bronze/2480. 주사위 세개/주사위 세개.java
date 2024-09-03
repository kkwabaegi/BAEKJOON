import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();//현재 시간
		int b=s.nextInt();//현재 분
		int c=s.nextInt();//조리시간
		int Big=0;
		if(a==b&&a==c&&b==c) {
			System.out.println(10000+a*1000);
		}
		else if(a==b || a==c) {
			System.out.println(1000+a*100);
		}
		else if(c==b) {
			System.out.println(1000+c*100);
		}
		else {
			if(a>b&&a>c) {
				Big=a;
			}
			else if(b>a&&b>c) {
				Big=b;
			}
			else if(c>a&&c>b) {
				Big=c;
			}
			System.out.println(Big*100);
		}

	}

}