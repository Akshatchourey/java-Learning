import java.util.HashMap;
import java.util.Map;

public class Rough{
    static String smallestWindow(String s, String p){
        if(s.length() < p.length()) return "-1";

        Map<Character, Integer> myMap = new HashMap<>();
        for(char u:p.toCharArray()) myMap.put(u, myMap.getOrDefault(u, 0)+1);

        StringBuilder str = new StringBuilder();
        String ans = s; Character ch; int check;

        for(char c:s.toCharArray()){
            if(str.length() == 0 && !myMap.containsKey(c)) continue;
            check = 0;
            str.append(c);
            if(myMap.containsKey(c)) myMap.put(c, myMap.get(c)-1);

            for(int k: myMap.values()) if(k > 0){ check = 1; break; }
            if(check == 0){
                while(myMap.get(str.charAt(0)) < 0){
                    ch = str.charAt(0);
                    myMap.put(ch, myMap.get(ch)+1);
                    int i=1;
                    for(i=1;i<str.length();i++) if(myMap.containsKey(str.charAt(i))) break;
                    str.delete(0,i);
                }
                if(str.length() < ans.length()) ans = str.toString();
            }
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(smallestWindow("zoomlazapzo", "oza"));
    }
}
