
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int 투자금 = s.nextInt();
		int 유지비 = s.nextInt();
		int 이익 = s.nextInt();
		int 실제이익=이익-유지비;
		int 손익분기점 =0;
		if (실제이익<=0) {
			System.out.println(-1);
		}
		else {
			손익분기점=투자금/실제이익;
			손익분기점++;
			System.out.println(손익분기점);
		}
	}

}