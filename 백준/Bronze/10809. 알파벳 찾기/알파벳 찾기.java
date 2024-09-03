import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
      String ABC = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
      String[] ABCarr = ABC.split(" ");
      String N =s.nextLine();
      
      for(int a=0;a<26;a++) {
    	  System.out.print(N.indexOf(ABCarr[a])+" ");
      }

	}

}
