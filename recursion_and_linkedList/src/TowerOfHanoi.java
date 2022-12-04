public class TowerOfHanoi {
    public static void fun(int n,String start,String help,String end){
        if(n == 1){
            System.out.println("Transfer disc "+n+" from "+start+" - "+end);
            return;
        }
        fun(n-1,start,end,help);
        System.out.println("Transfer disc "+n+" from "+start+" - "+end);
        fun(n-1,help,start,end);
    }
    public static void main(String[] args){
        fun(5,"s","h","e");
    }
}
