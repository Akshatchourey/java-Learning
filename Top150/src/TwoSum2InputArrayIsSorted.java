import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TwoSum2InputArrayIsSorted{
    static int[] twoSum1(int[] numbers, int target){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i< numbers.length;i++){
            int j = Collections.binarySearch(arr, target-numbers[i]);
            if(j != -1) return new int[]{j+1, i+1};
            arr.add(numbers[i]);
        }
        return new int[]{-1,-1};
    }
    static int[] twoSum2(int[] arr, int t){
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(myMap.containsKey(t-arr[i])) return new int[]{myMap.get(t-arr[i])+1, i+1};
            myMap.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){

    }
}
