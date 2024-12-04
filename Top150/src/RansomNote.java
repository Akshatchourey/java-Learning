public class RansomNote{
    static boolean canConstruct(String ransomNote, String magazine){
        int[] arr = new int[26];
        for(char k:ransomNote.toCharArray()) arr[k-'a']++;
        for(char k:magazine.toCharArray()) arr[k-'a']--;
        for(int k:arr) if(k>0) return false;
        return true;
    }
    public static void main(String[] args){
        System.out.println(canConstruct("aa", "aab"));
    }
}
