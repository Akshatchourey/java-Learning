import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak{
    static boolean helper(String s, Set<String> dict, int k, Boolean[] dp){
        int n = s.length();
        if (k == n) return true;
        if (dp[k] != null) return dp[k];
        for(int i=k+1;i<=n;i++){
            String s1 = s.substring(k, i);
            if(dict.contains(s1) && helper(s,dict,i,dp)){
                return dp[k] = true;
            }
        }
        return dp[k] = false;
    }
    static boolean wordBreak(String str, List<String> dict){
        Boolean[] dp = new Boolean[str.length() + 1];
        return helper(str, new HashSet<>(dict), 0, dp);
    }
    public static void main(String[] args){
        List<String> dict = new ArrayList<>();
        dict.add("leet");
        dict.add("leetcode");
        System.out.println(wordBreak("leetcode", dict));
    }
}
