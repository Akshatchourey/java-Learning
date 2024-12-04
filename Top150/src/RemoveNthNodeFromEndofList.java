public class RemoveNthNodeFromEndofList{
    static ListNode removeNthFromEnd(ListNode root, int n){
        ListNode right = root; ListNode left = root;
        for(int i=0;i<n;i++) right = right.next;
        if(right == null) return root.next;
        while(right.next != null){
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;
        return root;
    }
    public static void main(String[] args){
    }
}
