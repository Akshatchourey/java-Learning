import java.util.ArrayList;


// TLE error 1000/1020
public class PerfectSumProblem{
    static int perfectSum(int[] arr, int n, int t){
        ArrayList<Integer> asq = new ArrayList<>();
        int ans = 0, zero = 0, s;
        int temp;
        for(int i=0;i<n;i++){
            temp = arr[i]; s = asq.size();
            if(temp == 0){zero++; continue;}
            asq.add(temp);
            for(int j=0;j<s;j++){
                if((temp+asq.get(j))%1000000007 <= t){
                    asq.add((temp+asq.get(j))%1000000007);
                }
            }
        }
        for(int k:asq) if(k == t) ans++;
        ans = (ans * (int)Math.pow(2, zero)%1000000007);
        return ans;
    }
    public static void main(String[] args){
        int n = 6, sum = 10;
        int[] arr = {5, 2, 3, 10, 6, 8};
        System.out.println(perfectSum(arr, n, sum));
    }
}
