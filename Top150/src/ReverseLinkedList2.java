
class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseLinkedList2{
    static ListNode rightMost, leftMost;
    static ListNode helper(ListNode curr, int no){
        if(no == 0){
            rightMost = curr.next;
            leftMost.next = curr;
            return curr;
        }
        System.out.println(curr.val+ " " + no);
        helper(curr.next, no-1).next = curr;
        return curr;
    }
    static ListNode reverseBetween(ListNode root, int left, int right){
        leftMost = new ListNode();
        if(left == 1){
            helper(root, right-left).next = null;
            return leftMost.next;
        }
        leftMost = root;
        for(int i=0;i<left-2;i++) leftMost = leftMost.next;
        helper(leftMost.next, right-left).next = rightMost;
        return root;
    }
    public static void main(String[] args){
    }
}
