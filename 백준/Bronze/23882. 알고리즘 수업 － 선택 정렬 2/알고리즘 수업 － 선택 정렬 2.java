import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();//6
		int 교환횟수=s.nextInt();//10
		int numm[]=new int[num];
		int nom[]=new int[num];
		int 들어갈자리=num-1;
		int 바꿀자리=0;
		int temp=0;
		for(int i=0;i<num;i++) {
			numm[i]=s.nextInt();
			nom[i]=numm[i];
		}
		Arrays.sort(nom);
		for(int i=1;i<=교환횟수;i++) {
			for(int k=num-1;k>-2; k--) {
				if(k<0) {
					System.out.println(-1);
					들어갈자리=k;
					break;
				}
				if(numm[k]!=nom[k]) {
					들어갈자리=k;
					break;
				}
			}
			if(들어갈자리<0) {
				break;
			}
			if(numm[바꿀자리]!=nom[들어갈자리]) {
				바꿀자리=0;
				while(numm[바꿀자리]!=nom[들어갈자리]) {
					바꿀자리++;
				}
			}
			if(numm[바꿀자리]!=numm[들어갈자리]) {
				temp = numm[바꿀자리];
				numm[바꿀자리] = numm[들어갈자리];
				numm[들어갈자리]=temp;
			}
		}
		if(들어갈자리>=0) {
			for(int j=0;j<num;j++) {
				System.out.print(numm[j]+" ");
			}
		}
	}
}