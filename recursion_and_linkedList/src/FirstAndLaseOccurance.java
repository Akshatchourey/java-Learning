public class FirstAndLaseOccurance {
    public static int first=-1;
    public static int last=-1;
    public static void fun(String  str, int idx,char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char character = str.charAt(idx);
        if(character == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        fun(str,idx+1,element);
    }
    public static void main(String[] args){
        String Q = "abaacdaefaah";
        fun(Q,0,'a');
    }
}
