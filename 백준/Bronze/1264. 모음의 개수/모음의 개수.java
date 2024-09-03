import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	      String ABC = "A E I O U a e i o u";
	      String[] ABCarr = ABC.split(" ");    
	      int count=0;
			while(true) {
				String in = s.nextLine();
				if(in.equals("#")) {
					break;
				}
				String[] Str = in.split("");
			      for (int i = 0;i<=Str.length-1;i++)
			      {
			    	  for(int a=0;a<10;a++) {
				    	  if(Str[i].equals(ABCarr[a])) {
				    		  count+=1;
				    	  }
			    	  }
			      }
			      System.out.println(count);
			      count=0;
			}
	}

}