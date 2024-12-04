public class ReverseWordsinaString{
    static String reverseWords(String str) {
        StringBuilder ans = new StringBuilder("");
        String[] arr = str.split(" +");
        for(int i=arr.length-1;i>=0;i--){
            ans.append(arr[i]);
            ans.append(" ");
        }
        ans.deleteCharAt(ans.length()-1);
        if(ans.charAt(ans.length()-1) == ' ') ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
    public static void main(String[] args){
        System.out.println(reverseWords("the sky is blue"));
    }
}
