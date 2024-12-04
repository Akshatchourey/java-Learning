import java.util.Arrays;

public class MaxOccurredIntegerInGivenRange {
    static int helper(int n, int l[], int r[], int maxx){
        int[] a = new int[maxx+2];
        Arrays.fill(a, 0);
        for(int i=0;i<n;i++){
            a[l[i]] += 1;
            a[r[i]+1] -= 1;
        }
        int x = 0, y = 0, ans=0;
        for(int i=0;i<a.length;i++){
            x += a[i];
            if(x > y){
                y = x;
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] l = {1,5,9,13,21};
        int[] r = {15,8,12,20,30};
        int maxx = 30;
        System.out.println(helper(n, l, r, maxx));
    }
}
