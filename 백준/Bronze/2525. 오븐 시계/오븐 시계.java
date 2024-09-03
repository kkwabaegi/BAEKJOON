
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int NH=s.nextInt();
		int NM=s.nextInt();
		int CM=s.nextInt();
		NH=NH*60;
		int 응애=NH+NM+CM;
		NH=응애/60;
		NM=응애%60;
		NH%=24;
		System.out.println(NH+" "+NM);

	}

}
