
public class OPrintKeyboardCombinations {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yx"};
    public static void combinationsFirst(String no,int idx,String newCombinations){
        if(idx == no.length()){
            System.out.println(newCombinations);
            return;
        }
        String map = keypad[no.charAt(idx)-'0'];
        for(int i=0;i<map.length();i++){
            combinationsFirst(no,idx+1,newCombinations+map.charAt(i));
        }
    }

    public static String[] keypadByMe={"",".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void combinationsByMe(int[] a, int level, String newString){
        if(level == a.length){
            System.out.println(newString);
            return;
        }
        String currentString = keypadByMe[a[level]];
        for(String k:currentString.split("")){
            combinationsByMe(a,level+1, newString+k);
        }
    }

    public static void main(String[] args) {
        combinationsFirst("23",0,"");
        System.out.println(" ");

        int[] a = {5,8,8,9,8};
        combinationsByMe(a,0, "");
    }
}
