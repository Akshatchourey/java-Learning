class Node_Linked{
    int data;
    Node_Linked next;
}
public class RemoveOccurrencesDuplicatesInLinkedList{
    public static void main(String[] args){
        Node_Linked head = new Node_Linked();
        Node_Linked node = head;
        int[] arr = {23, 23,28,28,35,49,49,53,54};
        for(int i=0;i<9;i++){
            node.data = arr[i];
            node.next = new Node_Linked();
            node = node.next;
        }

        Node_Linked papa = new Node_Linked();
        Node_Linked ans = papa;
        Node_Linked bata = head;

        int value = bata.data, y = 0;
        while(bata.next != null){
            if(bata.next.data == value) y = 1;
            else{
                if(y == 0){
                    papa.next = bata;
                    papa = bata;
                }else y = 0;
                value = bata.next.data;
            }
            bata = bata.next;
        }
        if(y == 0) papa.next = bata;
        else papa.next = null;
        node = ans.next;

        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}
