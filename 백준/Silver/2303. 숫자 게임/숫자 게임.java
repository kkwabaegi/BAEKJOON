

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int player=s.nextInt();
		int 젤큰수=0;
		int[] player점수 =new int[player];
		int[] 카드=new int[5];
		int 카드합=0;
		int 승리자 =0;
		for(int i=0;i<player;i++) {
			젤큰수=0;
			for(int j=0;j<5;j++) {
				카드[j]=s.nextInt();
			}
			for(int a=0;a<5;a++) {
				for(int b=0;b<5;b++) {
					if(b==a) {
						continue;
					}
					for(int c=0;c<5;c++) {
						if(c==a||c==b) {
							continue;
						}
						카드합=카드[a]+카드[b]+카드[c];
						if(카드합%10>젤큰수) {
							젤큰수=카드합%10;
						}
					}
				}
			}
			player점수[i]=젤큰수;
		}
		젤큰수=0;
		for(int i=0;i<player;i++) {
			if(player점수[i]>=젤큰수) {
				젤큰수=player점수[i];
				승리자=i+1;
			}
		}
		System.out.println(승리자);



	}

}