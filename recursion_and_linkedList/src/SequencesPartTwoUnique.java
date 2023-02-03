import java.util.HashSet;
public class SequencesPartTwoUnique{
    public static void fun(String str, int idx,String newstring,HashSet<String> set){
        if(idx == str.length()){
            if(!set.contains(newstring)) {
                set.add(newstring);
                System.out.println(newstring);
            }
            return;
        }
        char newchar = str.charAt(idx);
        fun(str,idx+1,newstring+newchar,set);
        fun(str,idx+1,newstring,set);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        fun("aaa",0,"",set);
    }
}
