import java.util.*;

public class GroupAnagrams{
    static List<List<String>> groupAnagrams(String[] str){
        Map<String, List<String>> myMap = new HashMap<>();
        for(String k:str){
            char[] ch = k.toCharArray();
            Arrays.sort(ch);
            String key = Arrays.toString(ch);
            String abc = String.valueOf(ch);
            System.out.println(abc);
            List<String> arr = myMap.getOrDefault(key, new ArrayList<>());
            arr.add(k);
            myMap.put(key, arr);
        }
            return new ArrayList<>(myMap.values());
    }
    public static void main(String[] args){
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}
