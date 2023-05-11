public class ex1 {
    public static int rec(int ans,int no,int n){
        if(no==n+1){
            return ans;
        }
        ans += no;
        return rec(ans,no+1,n);
   }
   public static void main(String[] args) {
       System.out.println(rec(0,1,9));
    }
}

