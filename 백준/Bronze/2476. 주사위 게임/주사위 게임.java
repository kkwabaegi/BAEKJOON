
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int 참여자=s.nextInt();
		int rand[]=new int[3];
		int 젤큰수=0;
		int 상금[]=new int[참여자];
		int 우승상금=0;
		for(int i=0;i<참여자;i++) {
			for(int j=0;j<3;j++) {
				rand[j]=s.nextInt();
			}
				if(rand[0]==rand[1]&&rand[0]==rand[2]) {
					상금[i]=10000+(rand[0]*1000);
				}
				else if(rand[0]==rand[1]||rand[0]==rand[2]||rand[1]==rand[2]) {
					if(rand[0]==rand[1]) {
						상금[i]=1000+(rand[0]*100);
					}
					else if(rand[0]==rand[2]) {
						상금[i]=1000+(rand[0]*100);
					}
					else {
						상금[i]=1000+(rand[1]*100);
					}
				}
				else {
					for(int k=0;k<3;k++) {
						if(rand[k]>젤큰수) {
							젤큰수=rand[k];
						}
					}
					상금[i]=젤큰수*100;
				}
				if(상금[i]>우승상금) {
					우승상금=상금[i];
				}
		}
		System.out.println(우승상금);
	}

}