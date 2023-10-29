import java.util.*;

public class G_108{
    static int MinCost(int n, int[] prices,int[] dislike){
        int ans = prices[0];
        int idxOfFriend = 0;
        Set<Integer> mySet = new HashSet<>();
        for(int i=0;i<n;i++){
            mySet.add(dislike[i]);
            if(prices[i] < ans){
                idxOfFriend = i;
                ans = prices[i];
            }
        }
        if(mySet.size() == 1) return -1;
        int ans2 = Integer.MAX_VALUE; // new thing learn
        for(int i=0;i<n;i++){
            if(dislike[i] != dislike[idxOfFriend]){
                if(prices[i] < ans2){
                    ans2 = prices[i];
                }
            }
        }
        return ans+ans2;
    }
    // no logic wrong code.
    static long MinDiff(int n, int A[], int B[]){
        long l = Arrays.stream(B).sum()+1; int r = 0;
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i=0;i<A.length;i++) myMap.put(A[i],B[i]);
        Map<Integer, Integer> myMapp = new HashMap<>();
        for(int k: myMap.keySet())myMapp.put(myMap.get(k),k);
        myMapp.put(1,1);
        int b = B[B.length-1]; int a = myMapp.get(b);
        while(b != 1 && l-r-b > 0){
            l -= r;
            r += b;
            b = a;
            a = myMapp.get(b);
        }
        return l-r;
    }
    public static void main(String[] args){
        // Q1 Done
        int N = 5;
        int[] prices = {10, 8, 5, 12, 8};
        int[] dislike = {1, 1, 3, 2, 4};
//        System.out.println(MinCost(N,prices, dislike));
        // Q2 Tree question not able to do (studding trees not studded)
        int n = 3;
        int[] A = {1, 1};
        int[] B = {2, 3};
        System.out.println(MinDiff(n,A,B));
        // Q3 Not able to do(error in sample test case)
    }
}
