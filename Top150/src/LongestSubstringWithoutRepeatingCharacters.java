import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters{
    static int lengthOfLongestSubstring(String s){
        int ans = 0, j = 0;
        Set<Character> mySet = new HashSet<>();

        for(int i=0;i<s.length();i++){
            if(!mySet.contains(s.charAt(i))){
                mySet.add(s.charAt(i));
                ans = Math.max(ans, i-j+1);
            }else{
                while(s.charAt(j) != s.charAt(i)){
                    mySet.remove(s.charAt(j++));
                }
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args){

    }
}
