public class PermutationsOfAString{
    public static void permutation(String str,String newPer){
        if(str.length() == 0){
            System.out.println(newPer);
            return;
        }
        for(int i=0;i<str.length();i++){
            char newChar = str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i+1);
            permutation(newString,newPer+newChar);
        }
    }
    public static void main(String[] args) {
        permutation("abcd","");
    }
}
