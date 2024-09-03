import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[] N1=s.next().split("");
        int Num1=Integer.parseInt(N1[2])*100+Integer.parseInt(N1[1])*10+Integer.parseInt(N1[0]);
        String[] N2=s.next().split("");
        int Num2=Integer.parseInt(N2[2])*100+Integer.parseInt(N2[1])*10+Integer.parseInt(N2[0]);
        if(Num1>Num2){
            System.out.println(Num1);
        }
        else{
            System.out.println(Num2);
        }

	}
}