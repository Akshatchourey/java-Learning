import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class AddTwoNoLinkList{
    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        while(l1 != null){
            a.add(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            b.add(l2.val);
            l2 = l2.next;
        }

        int fNo, sNo, sum, carry=0;
        ListNode first = new ListNode();
        ListNode head = first;

        for(int i=0; i<Math.max(a.size(), b.size()); i++){
            fNo = sNo = 0;
            if(i < a.size()) fNo = a.get(i);
            if(i < b.size()) sNo = b.get(i);
            sum = fNo + sNo + carry;
            ListNode newNode = new ListNode(sum%10);
            first.next = newNode;
            first = newNode;
            sum /= 10;
            carry = sum;
        }
        if(carry != 0){
            first.next = new ListNode(carry);
        }
        return head.next;
    }
    public static void main(String[] args){
        System.out.println(addTwoNumbers(new ListNode(2), new ListNode(3)).val);
    }
}
