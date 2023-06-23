import java.util.Map;
import java.util.HashMap;

public class SubArraysWithEqual1sAnd0s{
    public static void main(String[] args){
        /*int[] arr = {1,0,1,0,1,0,1,0};
        int ans = 0; int sum;
        for(int i=0;i<arr.length;i++){
            sum = 0;
            for(int j=i;j<arr.length;j++){
                if(arr[j] == 1)sum += 1;
                else sum -= 1;
                if(sum == 0){ans += 1;}
            }
        }
        System.out.println(ans);*/

        // logic is unknown to me but it(logic) works...
        int[] arr = {1,0,1,1,1,1};
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0,1);
        int sum = 0; int ans = 0;
        for(int k:arr){
            if(k == 1){
                sum += 1;
            }else{
                sum -= 1;
            }
            if(count.containsKey(sum)){
                ans += count.get(sum);
                count.put(sum, count.get(sum)+1);
            }else{
                count.put(sum, 1);
            }
        }
        System.out.println(ans);
    }
}
