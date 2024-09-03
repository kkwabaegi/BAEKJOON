
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int 카드수=s.nextInt();
		int 목표수=s.nextInt();
		int[] 카드=new int[카드수];
		int 카드합=0;
		for(int i=0;i<카드수;i++) {
			카드[i]=s.nextInt();
		}
		for(int i=0;i<카드수;i++) {
			for(int j=0;j<카드수;j++) {
				if(카드[i]==카드[j]) {
					continue;
				}
				for(int u=0;u<카드수;u++) {
					if(카드[u]==카드[j]||카드[u]==카드[i]) {
						continue;
					}
					if(카드[i]+카드[j]+카드[u]<=목표수&&카드[i]+카드[j]+카드[u]>카드합 ) {
						카드합=카드[i]+카드[j]+카드[u];
					}
				}
			}
		}
		System.out.println(카드합);
		
		
	}

}
