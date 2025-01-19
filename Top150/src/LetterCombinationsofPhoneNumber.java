import java.util.List;
import java.util.ArrayList;

public class LetterCombinationsofPhoneNumber{
    static void helper(int idx, StringBuilder curr, String digits, String[] keys, List<String> ans){
        if(idx == digits.length()){
            ans.add(curr.toString());
            return;
        }
        int i = digits.charAt(idx) - '0' - 2;
        for(char k:keys[i].toCharArray()){
            curr.append(k);
            helper(idx+1, curr, digits, keys, ans);
            curr.deleteCharAt(curr.length()-1);
        }
    }
    static List<String> letterCombinations(String digits){
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0) return ans;
        String[] keys = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        helper(0,new StringBuilder(), digits, keys, ans);
        return ans;
    }
    public static void main(String[] args){
        for(String k:letterCombinations("23")){
            System.out.println(k);
        }
    }
}
