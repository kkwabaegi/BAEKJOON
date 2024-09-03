import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] n;
        Double sum1=0.0;
        Double sum2=0.0;
        for(int i=0;i<20;i++){
            n=sc.nextLine().split(" ");
            Double A=Double.parseDouble(n[1]);
            String B=n[2];
            Double C=0.0;

            if(B.equals("P")){
                continue;
            }
            
            switch(B){
                case("A+"):C=4.5; break;
                case("A0"):C=4.0; break;
                case("B+"):C=3.5; break;
                case("B0"):C=3.0; break;
                case("C+"):C=2.5; break;
                case("C0"):C=2.0; break;
                case("D+"):C=1.5; break;
                case("D0"):C=1.0; break;
                case("F"):C=0.0; break;
            }
            sum1+=A;
            sum2+=C*A;
        }
        System.out.println(sum2/sum1);
    }
}