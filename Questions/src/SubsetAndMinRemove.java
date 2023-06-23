import java.util.HashMap;
import java.util.Map;

public class SubsetAndMinRemove{
    static Map<Long, Long> A = new HashMap<>(); // Map<number, frequency>
    static Map<Long, Long> B = new HashMap<>(); // Map<number, frequency>
    static void makingMap(long[] a1, long[] a2, long n, long m){
        for(long k:a1){
            if(A.containsKey(k)){
                A.put(k, A.get(k)+1);
            }else{
                A.put(k,(long)1);
            }
        }
        for(long k:a2){
            if(B.containsKey(k)){
                B.put(k, B.get(k)+1);
            }else{
                B.put(k,(long)1);
            }
        }
    }
    static int minRemove(Map<Long, Long> A, Map<Long, Long> B){
        int ans = 0;
        // find minimum number of elements to remove from each array such that no common element exist in both the arrays ?
        for(long k:A.keySet()){
            if(B.containsKey(k)){
                ans += Math.min(A.get(k), B.get(k));
            }
        }
        return ans;
    }
    static String isSubset(Map<Long, Long> A, Map<Long, Long> B){
        // is subset of another array question
        for(long u:B.keySet()){
            if(A.containsKey(u)){
                if(B.get(u) > A.get(u)){
                    return "No";
                }
            }else{
                return "No";
            }
        }
        return "Yes";
    }
    public static void main(String[] args){
        long[] a = {1, 2, 3, 4, 4, 5, 6};
        long[] b = {1,2,4};
        makingMap(a,b,a.length,b.length);
        System.out.println(minRemove(A, B));
        System.out.println(isSubset(A, B));
    }
}
