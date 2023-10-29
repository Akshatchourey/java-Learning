import java.util.ArrayList;

public class BoundaryTofBT{
//    4 10 N 5 5 N 6 7 N 8 8 N 8 11 N 3 4 N 1 3 N 8 6 N 11 11 N 5 8
    static int[] arr = {1,2,4,6,-1,-1,5,-1,-1,9,-1,3,7,-1,-1,8,-1,-1,-1};
    static int idx = 0;
    static Node createTreeUsingArray(){
        if(arr[idx] == -1) return null;
        Node root = new Node(arr[idx]);
        idx++; root.left = createTreeUsingArray();
        idx++; root.right = createTreeUsingArray();
        return root;
    }
    public static void main(String[] args){
        Node root = createTreeUsingArray();
        ArrayList<Integer> left = new ArrayList<>();
        if(root.left != null){
            leftAdd(root, left); left.remove(left.size()-1);
        }
        leafAdd(root, left);
        if(root.right != null){
            left.remove(left.size()-1);
            rightAdd(root.right, left, left.size());
        }
        System.out.println(left);
    }
    static int leftAdd(Node root, ArrayList<Integer> left){
        if(root == null) return 0;
        left.add(root.data);
        if(leftAdd(root.left, left) == 1) return 1;
        leftAdd(root.right, left);
        return 1;
    }
    static int leafAdd(Node root, ArrayList<Integer> left){
        if(root == null) return 0;
        int l = leafAdd(root.left, left);
        int r = leafAdd(root.right, left);
        if(l == 0 && r == 0){
            left.add(root.data);
        }
        return 1;
    }
    static int rightAdd(Node root, ArrayList<Integer> left, int idx){
        if(root == null) return 0;
        left.add(idx, root.data);
        if(rightAdd(root.right, left, idx) == 1) return 1;
        rightAdd(root.left, left, idx);
        return 1;
    }
}
