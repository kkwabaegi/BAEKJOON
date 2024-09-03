import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack();
        StringBuffer result = new StringBuffer();
        int n = sc.nextInt();
        boolean err = false;
        int temp=1;

        for(int i = 0; i<n;i++){
            int x = sc.nextInt();
            if(x>=temp){
                while(x>=temp){
                    stack.push(temp++);
                    result.append("+\n");
                }
                stack.pop();
                result.append("-\n");
            }
            else{
                if(stack.pop()>x){
                    err=true;
                    break;
                }
                else{
                    result.append("-\n");
                }
            }
        }
        if(err){
            System.out.println("NO");
        }
        else{
            System.out.println(result);
        }
    }
}
