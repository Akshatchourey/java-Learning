public class SortList{
    static ListNode split(ListNode head){
        ListNode fast = head, slow = head, temp = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            temp = slow;
            slow = slow.next;
        }
        temp.next = null;
        return slow;
    }
    static ListNode merge(ListNode a, ListNode b){
        if(a == null) return b;
        if(b == null) return a;
        if(b.val <= a.val){
            b.next = merge(a, b.next);
            return b;
        }else{
            a.next = merge(a.next, b);
            return a;
        }
    }
    static ListNode sortList(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode split = split(head);

        ListNode a = sortList(head);
        ListNode b = sortList(split);
        return merge(a, b);
    }
    public static void main(String[] args){
    }
}
