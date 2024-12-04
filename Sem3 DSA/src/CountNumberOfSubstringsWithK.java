import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountNumberOfSubstringsWithK{
    /*
    static int unique(int[] arr){
        int c = 0;
        for(int k:arr) if(k>0) c++;
        return c;
    }
    static long helper(String str, int k){
        long count = 0;
        int i,j=0;
        int[] arr = new int[27];
        for(i=0;i<str.length();i++){
            arr[str.charAt(i) - 'a']++;
            if(unique(arr) == k) break;
        }
        count++; i++;
        for(i=i;i<str.length();i++){
            arr[str.charAt(i) - 'a']++;
            if(unique(arr) == k) count++;
            else{
                if(i == str.length()-1) arr[26] = 1;
                while(unique(arr) > k){
                    arr[str.charAt(j) - 'a']--;
                    j++;
                    count++;
                }
            }
        }
        return count;
    }
     */

    // I don't think this is correct
    static Map<String, Long> myMap;
    static int unique(String str){
        Set<Character> asq = new HashSet<>();
        for(char k:str.toCharArray()) asq.add(k);
        return asq.size();
    }
    static long substrCount (String curr, String str, int i, int k){
        long l = 0, r = 0;
        if(i < str.length()){
            curr += str.charAt(i);
            if(myMap.containsKey(curr)){
                r = myMap.get(curr);
            }
            else r = substrCount(curr, str, i+1, k);
        }
        if(unique(curr) < k) return 0;

        curr = curr.substring(1);
        l = substrCount(curr, str, i, k);
        myMap.put(curr, l+r);
        return l+r;
    }
    public static void main(String[] args){
        String s = "abaaca"; int k = 1;
        myMap = new HashMap<>();
        System.out.println(substrCount("", s, 0, k));

//        StringBuilder temp = new StringBuilder("asdf");
//        temp.delete(0,1);
//        s.substring(1,s.length());

    }
}
