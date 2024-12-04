public class RemoveDuplicatesfromSortedList2{
    static ListNode deleteDuplicates(ListNode root){
        ListNode a = new ListNode();
        ListNode ans = a;
        int no = -200, check = 0;
        while(root != null){
            if(root.val != no){
                if(check == 1){
                    ListNode temp = new ListNode(no);
                    a.next = temp;
                    a = temp;
                }else check = 1;
                no = root.val;
            }else{
                check = 0;
            }
            root = root.next;
        }
        if(check == 1) a.next = new ListNode(no);
        return ans.next;
    }
    public static void main(String[] args){
    }
}
