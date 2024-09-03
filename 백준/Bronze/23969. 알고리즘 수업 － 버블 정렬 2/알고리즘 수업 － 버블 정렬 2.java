
import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int 자리바꿈=s.nextInt();
		int temp =0;
		int count=0;
		int c=0;
		int F=0;
		int nom[]=new int[num];
		int numm[]=new int[num];
		for(int i=0;i<num;i++) {
			numm[i]=s.nextInt();
			nom[i]=numm[i];
		}
		for(int i=0;i<num-1;i++) {
			for(int A=0;A<num-1-F;A++) {
				if(numm[A]>numm[A+1]) {
					temp=numm[A];
					numm[A]=numm[A+1];
					numm[A+1]=temp;
					count++;
					if(count==자리바꿈) {
						break;
					}
				}
			}
			if(count==자리바꿈) {
				break;
			}
			F++;
		}
		if(자리바꿈>count) {
			System.out.println(-1);
		}
		else {
			for(int j=0;j<num;j++) {
				System.out.print(numm[j]+" ");
			}

		}
	
	}

}