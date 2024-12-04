import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings{
    static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()) return false;
        Map<Character, Character> myMap = new HashMap<>();
        char a, b;
        for(int i=0;i<s.length();i++){
            a = s.charAt(i); b = t.charAt(i);
            if(!myMap.containsKey(a)){
                for(char k: myMap.values()) if(k == b) return false;
                myMap.put(a, b);
            }else if(myMap.get(a) != b) return false;
        }
        return true;
    }
    // test this code later
    static boolean isIsomorphic2(String s, String t){
        if(s.length() != t.length()) return false;
        char[] arr = new char[256];
        Arrays.fill(arr, ' ');;
        for(int i=0;i<s.length();i++){
            char c = arr[s.charAt(i) - 'a'];
            if(c == ' '){
                for(char k:arr) if(k == t.charAt(i)) return false;
                arr[s.charAt(i) - 'a'] = t.charAt(i);
            }else if(c != t.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isIsomorphic("paper", "title"));
    }
}
