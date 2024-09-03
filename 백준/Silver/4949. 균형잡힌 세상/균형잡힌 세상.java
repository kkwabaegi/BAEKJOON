import java.util.Scanner;

class Main {
    private int top;
    private String[] stack;
    private String[] temp;
    

    public Main() {
        this.top = 0;
        this.stack = new String[10];
        this.temp = new String[10];
    }

    // 스택에 값을 추가하는 메서드
    public void push(String value) {
    	if(top == stack.length) { // 스택이 넘쳤을 경우에
            String[] newStack = new String[stack.length * 2]; // 배열이 가득 찼을 경우 크기를 현재 크기의 2배로 확장한다.
            for(int i = 0; i < top; i++){
                newStack[i] = stack[i];
            }
            stack = newStack; // 새로운 배열로 업데이트(배열의 길이 + 내용 전부 복사)
        }
        stack[top++] = value;
    	
    }

    // 스택에서 값을 제거하는 메서드
    public void pop() {
        if (!isEmpty()) {
            stack[--top] = null; // 가장 위에 있는 문자 삭제
        }else{
            System.out.println("asd");
        }
    }

    // 스택이 비어있는지 확인하는 메서드
    public boolean isEmpty() {
        return top==0;
    }

    // 스택의 맨 위의 값을 확인하는 메서드
    public String peek() {
        if (!isEmpty()) { // 스택이 존재 한다면?
            return stack[top-1];  // 가장 위에 있는 값을 반환
        }else{
            return "Asd"; // 존재하지 않을 시에는 공백을 반환
        }
    }

    public void printStack(){
        for(String i : stack){
            if(i!=null)System.out.print(i);
        }
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main stack = new Main();
		boolean err = false;

		while(sc.hasNext()){
			stack = new Main();
            String[] str = sc.nextLine().split("");
			err = false;
			if(str[0].equals(".")){
				break;
			}

			for(int i =0;i< str.length;i++){
				switch (str[i]) {
					case "[":
						stack.push("[");
						break;
					case "]":
						if(stack.peek().equals("["))stack.pop();
						else err = true;
						break;
					case "(":
						stack.push("(");
						break;
					case ")":
						if(stack.peek().equals("("))stack.pop();
						else err = true;
						break;
				}
			}
			if(err){
				System.out.println("no");
				continue;
			}

			if(stack.isEmpty()){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}

        }
	
	}
}