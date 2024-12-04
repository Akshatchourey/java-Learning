public class LongestCommonPrefix{
    static String longestCommonPrefix(String[] str){
        String ans = str[0];
        for(int i=1;i<str.length;i++){
            for(int j=0;j<ans.length();j++){
                if(j == str[i].length()){
                    ans = str[i]; break;
                }
                if(ans.charAt(j) != str[i].charAt(j)){
                    ans = ans.substring(0,j); break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
