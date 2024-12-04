public class SmallestWindowContainingAllCharactersInS{
    static boolean checker(int[] arr){
        for(int k:arr){
            if(k < 0)  return true; // returns true if arr contains no<0
        }
        return false;
    }
    public static void main(String[] args){
        String s = "zoomlazapzo", p = "oza", ans=s+"hi", temp;
        int i,j=0;
        int[] arr = new int[26];
        for(char k:p.toCharArray()) arr[k - 'a']--;
        for(i=0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;

            if(checker(arr)) continue;
            while(arr[s.charAt(j) - 'a']-1 >= 0){
                arr[s.charAt(j) - 'a']--;
                j++;
            }
            temp = s.substring(j, i+1);
            if(temp.length() < ans.length()) ans = temp;
            arr[s.charAt(j) - 'a']--;
            j++;
        }
        if(ans.equals(s+"hi")) System.out.println(-1);
        System.out.println(ans);
    }
}
