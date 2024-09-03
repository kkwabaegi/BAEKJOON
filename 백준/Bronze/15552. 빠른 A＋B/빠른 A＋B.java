import java.io.*;
import java.util.StringTokenizer;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));//reader선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//writer선언
        StringTokenizer st;
        int n = Integer.parseInt(bf.readLine()); 

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(bf.readLine()); 

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a+b;

            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
	}

}
