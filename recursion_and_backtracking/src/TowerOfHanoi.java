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
    public static void towerByMe(int no, char start, char finall, char junction){
        if(no == 1){
            System.out.printf("%d(%c-%c) ",no,start, finall);
            return;
        }
        towerByMe(no-1,start,junction,finall);
        System.out.printf("%d(%c-%c) ",no,start, finall);
        towerByMe(no-1,junction,finall,start);
    }
    public static void main(String[] args){
//        fun(5,"s","h","e");

        // By me
        towerByMe(5,'S','F','T');
    }
}
