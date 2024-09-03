import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int 버섯=0;//버섯의 점수를 받을 방
		int 점수=0;//총 점수
		while(s.hasNextInt()){//수 입력이 있으면 반복
			버섯=s.nextInt();//버섯의 점수 받기
			점수+=버섯;//점수에 버섯을 더하기
			if(점수>100) {//만약 점수가 100이 넘어가면
				if(점수-100<=100-(점수-버섯)) {//100을 넘은 후 점수가 100을 넘기 전 점수보다 100에 가깝거나 같으면
					break;//점수를 그대로 두고
				}
				else {//아니면 100을 넘기전 점수로 바꾼다
					점수-=버섯;
					break;
				}
			}
		}
		System.out.println(점수);
	}

}
