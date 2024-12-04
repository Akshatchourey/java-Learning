import java.util.LinkedList;
import java.util.Queue;

public class MakeBinaryTreeFromLinkedList{
    public static void main(String[] args){
        Node_Linked head = new Node_Linked();
        Node_Linked temp = head;
        int[] arr = {1,2,3,4,5};
        for(int i=0;i<5;i++){
            temp.data = arr[i];
            temp.next = new Node_Linked();
            temp = temp.next;
        }
        // Solution
        Queue<Node> myQueue = new LinkedList<>();
        Node node = new Node(head.data);
        temp = head.next;
        Node temp2 = node;
        int y = 1;
        while(temp != null){
            if((y&1) == 1){
                temp2.left = new Node(temp.data);
                myQueue.add(temp2.left);
            }else{
                temp2.right = new Node(temp.data);
                myQueue.add(temp2.right);
                temp2 = myQueue.poll();
            }
            temp = temp.next;
            y++;
        }

        Tree.levelOrder2Tree(node);
    }
}
