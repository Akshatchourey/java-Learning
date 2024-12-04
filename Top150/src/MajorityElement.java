import java.util.HashMap;
import java.util.Map;

public class MajorityElement{
    static int majorityElement(int[] arr){
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int k:arr) myMap.put(k, myMap.getOrDefault(k, 0)+1);
        int ans, check = 0;
        for(int k:myMap.keySet()){
            if(myMap.get(k) > arr.length/2) return k;
        }
        return -1;
    }
    public static void main(String[] args){

    }
}
