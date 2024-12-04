import java.util.Set;
import java.util.Stack;

public class EvaluateReversePolishNotation{
    public static Set<String> operands = Set.of("*", "+", "-", "/");
    static int cal(int a, int b, String k){
        if(k.equals("+")) return a+b;
        if(k.equals("-")) return a-b;
        if(k.equals("*")) return a*b;
        return a/b;
    }
    static int evalRPN(String[] arr){
        Stack<Integer> myStack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(operands.contains(arr[i])){
                int a = myStack.pop();
                int b = myStack.pop();
                myStack.push(cal(b, a, arr[i]));
            }else{
                myStack.push(Integer.parseInt(arr[i]));
            }
        }
        return myStack.peek();
    }
    public static void main(String[] args){
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}
