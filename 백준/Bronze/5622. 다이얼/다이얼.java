import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String Num[]=s.next().split("");
		int hap=0;
		for(int i=0;i<Num.length;i++) {
			if(Num[i].equals("A")||Num[i].equals("B")||Num[i].equals("C")) {
				hap+=3;
			}
			else if(Num[i].equals("D")||Num[i].equals("E")||Num[i].equals("F")) {
				hap+=4;
			}
			else if(Num[i].equals("G")||Num[i].equals("H")||Num[i].equals("I")) {
				hap+=5;
			}
			else if(Num[i].equals("J")||Num[i].equals("K")||Num[i].equals("L")) {
				hap+=6;
			}
			else if(Num[i].equals("M")||Num[i].equals("N")||Num[i].equals("O")) {
				hap+=7;
			}
			else if(Num[i].equals("P")||Num[i].equals("Q")||Num[i].equals("R")||Num[i].equals("S")) {
				hap+=8;
			}
			else if(Num[i].equals("T")||Num[i].equals("U")||Num[i].equals("V")) {
				hap+=9;
			}
			else if(Num[i].equals("W")||Num[i].equals("X")||Num[i].equals("Y")||Num[i].equals("Z")) {
				hap+=10;
			}
			else {
				hap+=11;
			}
		}
		System.out.println(hap);
		
	}	
}
