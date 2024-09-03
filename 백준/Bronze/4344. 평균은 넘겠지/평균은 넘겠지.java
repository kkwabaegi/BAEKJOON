import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int C = sc.nextInt();
        int sum = 0;
        double avg = 0;
        int count = 0;

        for(int i = 0 ; i < C; i++) {
            int N = sc.nextInt();
            int arr[] = new int[N];

            for(int j = 0; j < N; j++) {

            arr[j] = sc.nextInt();

            sum += arr[j];
            }
            
            avg = sum/N;

            for(int j = 0; j < N; j++) {
                if(arr[j] > avg) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", count/(double) N * 100);

            sum=0;
            count=0;
        }
    }

}
