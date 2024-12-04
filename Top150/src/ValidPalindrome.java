public class ValidPalindrome{
    static boolean isPalindrome(String s){
        int i=0, j=s.length()-1;
        char a, b;
        while(i<j){
            a = s.charAt(i); b = s.charAt(j);
            if(!Character.isLetterOrDigit(a)){
                i++; continue;
            }if(!Character.isLetterOrDigit(b)){
                j--; continue;
            }if(Character.toLowerCase(a) != Character.toLowerCase(b)) return false;
            i++; j--;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
