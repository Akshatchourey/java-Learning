import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses{
    static List<String> ans;
    static void helper(String str, int o, int c){
        if(c == 0) ans.add(str);
        else if(o == c) helper(str+"(", o-1, c);
        else if(o == 0) helper(str+")", o, c-1);
        else{
            helper(str+"(", o-1, c);
            helper(str+")", o, c-1);
        }
    }
    static List<String> generateParenthesis(int n){
        ans = new ArrayList<>();
        helper("", n, n);
        return ans;
    }
    public static void main(String[] args){
        for(String k:generateParenthesis(4)){
            System.out.println(k);
        }
    }
}
