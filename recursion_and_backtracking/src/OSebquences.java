
import java.util.*;

public class OSebquences {
    public static void fun(String s, int idx,String newstring){
        if(idx == s.length()){
            System.out.println(newstring);
            return;
        }
        char newchar = s.charAt(idx);
        fun(s,idx+1,newstring+newchar);
        fun(s,idx+1,newstring);
    }

    // :(:( This code is rely confusing.
    public static List<String> lexicographically(String s, int idx, String newstring){
        List<String> arr = new ArrayList<>();
        if(idx == s.length()){
            arr.add(newstring);
            return arr;
        }
        char newchar = s.charAt(idx);
        arr.addAll(lexicographically(s,idx+1,newstring+newchar));
        arr.addAll(lexicographically(s,idx+1,newstring));
        Collections.sort(arr);
        return arr;
    }

    public static void main(String[] args){
        fun("abc",0,"");

        List<String> ans = new ArrayList<>(lexicographically("abc", 0, ""));
        System.out.println(ans.subList(1,ans.size()));
    }
}
