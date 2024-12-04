public class JumpGame{
    static boolean canJump(int[] nums){
        int idx = 0, i = 0;
        while(idx >= i){
            idx = Math.max(idx, i + nums[i++]);
            if(idx >= nums.length) return true;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(canJump(new int[]{2,3,1,1,4}));
    }
}
