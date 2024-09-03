import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String[] Str;
        boolean err=false;
        int hap=0;
        for(int i=0;i<N;i++){
            Str=s.next().split("");
            for(int j=0;j<Str.length;j++){
                for(int k=j+2;k<Str.length;k++){
                    if(Str[k].equals(Str[j])&&!Str[k].equals(Str[k-1])){
                        err=true;
                    }
                }
            }
            if(err==false){
                hap++;
            }
            err=false;
        }
        System.out.println(hap);
        s.close();
	}
}