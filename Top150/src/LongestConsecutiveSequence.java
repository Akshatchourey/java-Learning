import java.util.HashSet;

public class LongestConsecutiveSequence{
    static int longestConsecutive(int[] nums){
        int ans = 0;
        HashSet<Integer> myHashSet = new HashSet<>();
        for(int k:nums) myHashSet.add(k);
        for(int i=0;i<nums.length;i++){
            if(!myHashSet.contains(nums[i])) continue;
            if(!myHashSet.contains(nums[i]-1)){
                int k = nums[i], length = 1;
                while(myHashSet.contains(k+1)){
                    k++; length++;
                    myHashSet.remove(k);
                }
                ans = Math.max(ans, length);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}
