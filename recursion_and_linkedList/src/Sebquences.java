public class Sebquences{
    public static void fun(String str, int idx,String newstring){
        if(idx == str.length()){
            System.out.println(newstring);
            return;
        }
        char newchar = str.charAt(idx);
        fun(str,idx+1,newstring+newchar);
        fun(str,idx+1,newstring);
    }
    public static void main(String[] args) {
        fun("aabb",0,"");
    }
}
