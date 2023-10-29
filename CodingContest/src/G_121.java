public class G_121{
    static String construct(int n, int k){
        StringBuilder str = new StringBuilder();
        for(int i=0;i<n/2;i++) str.append("ab");
        if(n%2 != 0) str.append("a");
        return str.toString();
    }
    static int virusInfect(String s, int k){
        int ans = 0, count = 0, plInfect = 0;
        for(char u:s.toCharArray()){
                if(u-'0' == 1){
                    ans++;
                    if(count-k > 0) ans += k;
                    else ans += count;
                    plInfect = k;
                    count = 0;
                }
                else{
                    if(plInfect != 0){
                        ans++;
                        plInfect--;
                    }
                    else{
                        count++;
                    }
                }
        }
        return ans;
    }
    public static void main(String[] args){
        // Q1 Done
        System.out.println(construct(10, 3));

        // Q2 Done
            System.out.println(virusInfect("0010010101001001010001", 3));

        // Q3 DP problem out of my current knowledge.
    }
}
