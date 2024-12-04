import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2{
    static boolean containsNearbyDuplicate(int[] arr, int k){
        Set<Integer> mySet = new HashSet<>();
        int i = 0;
        for(int j = 0;j< arr.length;j++){
            if(j-i > k) mySet.remove((Integer) arr[i++]);
            if(mySet.contains(arr[j])) return true;
            mySet.add(arr[j]);
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }
}
