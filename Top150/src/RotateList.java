public class RotateList{
    static ListNode rotateRight(ListNode root, int k){
        if(k == 0 || root == null) return root;
        int size = 0;
        ListNode right = root; ListNode left = root;
        for(int i=0;i<k;i++){
            if(right == null) break;
            right = right.next;
            size++;
        }
        if(right == null){
            k = k%size;
            right = root;
            for(int i=0;i<k;i++) right = right.next;
            if(k == 0 || right == null) return root;
        }
        while(right.next != null){
            right = right.next;
            left = left.next;
        }
        right.next = root;
        ListNode ans = left.next;
        left.next = null;
        return ans;
    }
    public static void main(String[] args){
    }
}
