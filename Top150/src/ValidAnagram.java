import java.util.Arrays;

public class ValidAnagram{
    static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int k:arr) if(k != 0) return false;
        return true;
    }
    static boolean isAnagram2(String s, String t){
        if(s.length() != t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a); Arrays.sort(b);
        return Arrays.equals(a, b);
    }
    public static void main(String[] args){
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
