public class G_115{
    static int completeRows(int x){
        double a = (8L *x)+1;
        return Math.floorDiv((int)Math.sqrt(a)-1, 2);
    }
    static int minimum_difference(int n, String[] words){
        int s = words[0].length(); int temp = 0; int ans = Integer.MAX_VALUE; int value;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=0;k<s;k++){
                    value = words[i].charAt(k) - words[j].charAt(k);
                    temp += (value < 0) ? -value : value;
                }
                ans = Math.min(ans, temp); temp = 0;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        // Q1 Done
        System.out.println(completeRows(657136042));
        // Q2 Done
        System.out.println(minimum_difference(5, new String[]{"cdd", "zba","dgf","xyz","mnp"}));
        // Q3 not fully seen
    }
}
