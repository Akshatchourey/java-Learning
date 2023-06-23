import java.util.HashMap;
import java.util.Map;

public class Rough{
    static long findSubarray(long[] arr ,int n) {
        long ans = 0;
        long sum = 0;
        Map<Long, Long> myMap = new HashMap<>();
        myMap.put((long)0, (long)1);
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(myMap.containsKey(sum)){
                ans += myMap.get(sum);
                myMap.put(sum, myMap.get(sum)+1);
            }else{
                myMap.put(sum, (long)1);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        long[] arr = {0,0,5,5,0,0};
        System.out.println(findSubarray(arr, arr.length));
    }
}
