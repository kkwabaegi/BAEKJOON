import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[] Str=s.next().split("");
        String N="";
        String N2="";
        int hap=0;
        for(int i=0;i<Str.length;i++){
            if(i<Str.length-1){
                N=Str[i]+Str[i+1];
            }
            if(i<Str.length-2){
                N2=Str[i]+Str[i+1]+Str[i+2];
            }
            if(N2.equals("dz=")){
                hap++;
                i+=2;
            }
            else if(N.equals("c=")||
            N.equals("c-")||
            N.equals("d-")||
            N.equals("lj")||
            N.equals("nj")||
            N.equals("s=")||
            N.equals("z=")){
                hap++;
                i++;
            }
            else{
                hap++;
            }
            N="";
            N2="";
        }
        System.out.println(hap);
	}
}