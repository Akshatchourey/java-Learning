import java.util.Arrays;

public class HIndex{
    static int hIndex(int[] citations) {
        int ans = 0;
        Arrays.sort(citations);
        for(int i=citations.length-1;i>=0;i--){
            if(citations[i] < citations.length-i) break;
            ans++;
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(hIndex(new int[]{3,0,6,1,5}));
    }
}
