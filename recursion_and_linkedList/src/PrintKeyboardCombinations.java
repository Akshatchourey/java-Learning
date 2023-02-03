public class PrintKeyboardCombinations{
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yx"};
    public static void combinations(String no,int idx,String newCombinations){
        if(idx == no.length()){
            System.out.println(newCombinations);
            return;
        }

        String map = keypad[no.charAt(idx)-'0'];
        for(int i=0;i<map.length();i++){
            combinations(no,idx+1,newCombinations+map.charAt(i));
        }
    }
    public static void main(String[] args) {
        combinations("23",0,"");
    }
}
