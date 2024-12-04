public class PartitionList{
    static ListNode partition(ListNode root, int x){
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode temp1 = a;
        ListNode temp2 = b;
        while(root != null){
            if(root.val < x){
                a.next = root;
                a = a.next;
            }else{
                b.next = root;
                b = b.next;
                b.next = null;
            }
            root = root.next;
        }
        a.next = temp2.next;
        return temp1.next;
    }
    public static void main(String[] args){
    }
}
