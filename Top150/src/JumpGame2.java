public class JumpGame2{
    static int jump(int[] nums){
        int steps = 0, m = nums.length;
        int idx = nums[0], i = 1, max = 0;
        if(m == 1) return 0;
        if(nums[0] >= m-1) return 1;

        while(idx >= i){
            int curr = i + nums[i];
            if(curr >= m-1) return steps+2;

            max = Math.max(max, curr);
            if(idx == i){
                steps++;
                idx = max;
            }
            i++;
        }
        return steps;
    }
    public static void main(String[] args){
        System.out.println(jump(new int[]{2,0,5,2,4}));
    }
}
