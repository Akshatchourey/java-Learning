public class MoveXToTheEnd{
    public static void fun(StringBuilder sb, int idx){
        if(idx == -1){
            System.out.println(sb);
            return;
        }
        if(sb.charAt(idx) == 'x'){
            sb.delete(idx,idx+1);
            sb.append('x');
        }
        fun(sb,idx-1);
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("axbcxxd");
        fun(sb,sb.length()-1);
    }
}
