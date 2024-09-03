
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int 치킨=0;
		int 쿠폰=0;
		int 남은쿠폰=0;
		while(s.hasNextInt()) {
			int 시킨치킨=s.nextInt();
			int 교환=s.nextInt();
			쿠폰=시킨치킨;
			치킨=시킨치킨;
			while(교환<=쿠폰) {
				남은쿠폰=쿠폰%교환;
				쿠폰=(쿠폰/교환);
				치킨+=쿠폰;
				쿠폰+=남은쿠폰;
			}
			System.out.println(치킨);
		}
	}

}