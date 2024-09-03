import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int bm=1;
		int bj=1;
		int a=1;
        int b=1;
		for(int i=1;i<n;i++) {
			if(i>=a) {
				if(b%2==0) {
					bj++;
				}
				else {
					bm++;
				}
                b++;
				a+=b;
			}
			else if(b%2==0) {
				bm--;bj++;
			}
			else {
				bm++;bj--;
			}
		}
		System.out.println(bj+"/"+bm);
        s.close();		
	}

}