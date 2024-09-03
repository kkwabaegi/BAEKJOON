import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String in = s.nextLine();
		String[] Str = in.split("");
		String[] 반대= in.split("");
		int 헤으응 =0;
		
		 for (int i = Str.length - 1; i >= 0; i--)
	      {
		 		if(반대[(Str.length-1)-i].equals(Str[i])) {
		 			헤으응+=1;
		 		}
	      }
		 if(헤으응==Str.length) {
			 System.out.println("1");
		 }
		 else {
			 System.out.println("0");
		 }
	
	}

}