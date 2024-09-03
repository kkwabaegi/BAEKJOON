import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int 줄 = s.nextInt();
		int[] 횟수=new int[줄];
		int 시간 =0;
		int 기다린시간 =0;
		for(int i=0;i<줄;i++) {
			횟수[i]=s.nextInt();
		}
		Arrays.sort(횟수);
		for(int i=0;i<줄;i++) {
			기다린시간+=횟수[i];
			시간+=기다린시간;
		}
					System.out.println(시간);
	}

}