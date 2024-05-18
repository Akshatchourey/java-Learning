import java.util.*;

class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class Tree{
    static Scanner sc = new Scanner(System.in);
    static Queue<Node> myQueue = new LinkedList<>();
//    static int[] arr = {7,6,5,-1,-1,1,4,-1,-1,-1,2,8,-1,-1,3,-1,-1};
    static int[] arr = {1,2,4,-1,-1,5,-1,-1,3,6,-1,8,-1,-1,7,-1,-1};
    static int idx = 0;

    static Node createTreeUsingArray(){
        if(arr[idx] == -1) return null;
        Node root = new Node(arr[idx]);
        idx++; root.left = createTreeUsingArray();
        idx++; root.right = createTreeUsingArray();
        return root;
    }
    static Node createTree(){
        System.out.print("enter data:- ");
        int data = sc.nextInt();
        if(data == -1) return null;
        Node root = new Node(data);
        System.out.printf("Enter left of %d ", data);
        root.left = createTree();
        System.out.printf("Enter right of %d ", data);
        root.right = createTree();
        return root;
    }

    public static void main(String[] args){
//        Node  root = createTree();
        Node root = createTreeUsingArray();
        System.out.println("");
//        inOrder(root); System.out.println(" -:In-order traversal");
//        preOrder(root); System.out.println(" -:Pre-order traversal");
//        postOrder(root); System.out.println(" -:Post-order traversal");
        System.out.println("Height of tree by no of nodes(max height):- " + height(root));
//        System.out.println("Size of tree:- " + size(root));
//        System.out.println("Maximum value in tree:- " + maxVale(root));
//        System.out.println("Minimum value in tree:- " + minVale(root));
//        for(int i=1;i<=3;i++){levelOrder1(root, i);} // 3 is the height of tree
//        levelOrder2(root); System.out.println(" -:Level-order traversal");
//        levelOrder2Tree(root);
//        System.out.println(verticalOrder(root, new ArrayList<>()));

//        leftViewMy(root); System.out.println("<-- left view of binary tree by me.");
        int height = height(root);
        // Left view.
/*        int[] leftV = new int[height];
        leftViewSir(root,leftV,0);
        for(int u:leftV) System.out.print(u + " ");
        System.out.println("<-- left view of binary tree.");*/

        // Right view.
/*        int[] rightV = new int[height];
        rightViewSir(root,rightV,0);
        for(int u:rightV) System.out.print(u + " ");
        System.out.println("<-- right view of binary tree.");*/

//        System.out.println(diameter(root));
//        diameter2(root); System.out.println(diameterAns);
    }
    static int maxVale(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(maxVale(root.left), maxVale(root.right)));
    }
    static int minVale(Node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.data, Math.min(minVale(root.left), minVale(root.right)));
    }
    static  int size(Node root){
        if(root == null) return 0;
        return size(root.left) + size(root.right) + 1;
    }
    static int height(Node root){
        if(root == null) return 0;
        return Math.max(height(root.left), height(root.right))+1;
    }
    static int diameter(Node root){
        // O(n^2)
        if(root == null) return 0;
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int current = height(root.left)+height(root.right)+1;
        return Math.max(current,Math.max(ld,rd));
    }
    static int diameterAns = 0;
    static int diameter2(Node root){
        // O(n)
        if(root == null) return 0;
        int lh = diameter2(root.left);
        int rh = diameter2(root.right);
        diameterAns = Math.max(diameterAns, lh+rh+1);
        return Math.max(lh, rh)+1;

    }
    static void inOrder(Node A){
        if(A == null) return;
        inOrder(A.left);
        System.out.print(A.data + " ");
        inOrder(A.right);
    }
    static void preOrder(Node A){
        if(A == null) return;
        System.out.print(A.data + " ");
        preOrder(A.left);
        preOrder(A.right);
    }
    static void postOrder(Node A){
        if(A == null) return;
        postOrder(A.left);
        postOrder(A.right);
        System.out.print(A.data + " ");
    }
    static void levelOrder1(Node root, int level){
        if(root == null) return;
        if(level == 1){
            System.out.print(root.data + " ");
        }
        else if(level > 1){
            levelOrder1(root.left, level-1);
            levelOrder1(root.right, level-1);
        }
    }
    static void levelOrder2(Node root){
        myQueue.add(root);
        while(myQueue.size() != 0){
            Node A = myQueue.poll();
            System.out.print(A.data + " ");
            if(A.left != null) myQueue.add(A.left);
            if(A.right != null) myQueue.add(A.right);
        }
    }
    static void levelOrder2Tree(Node root){
        myQueue.clear();
        myQueue.add(root);
        myQueue.add(null);
        while(myQueue.size() > 1){
            Node A = myQueue.poll();
            if(A == null){
                System.out.println("");
                myQueue.add(null);
                continue;
            }
            System.out.print(A.data + " ");
            if(A.left != null) myQueue.add(A.left);
            if(A.right != null) myQueue.add(A.right);
        }
        System.out.println("");
    }
    static ArrayList<Integer> verticalOrder(Node root, ArrayList<Integer> ans){
        Map<Integer, ArrayList<Integer>> myMap = new TreeMap<>();
        Queue<Pare> q = new LinkedList<>();
        ArrayList<Integer> temp;
        q.add(new Pare(0, root));
        while(q.size() != 0){
            Pare a = q.poll();
            temp = myMap.getOrDefault(a.hd, new ArrayList<>());
            temp.add(a.node.data);
            myMap.put(a.hd, temp);
            if(a.node.left != null) q.add(new Pare(a.hd-1, a.node.left));
            if(a.node.right != null) q.add(new Pare(a.hd+1, a.node.right));
        }
        for(ArrayList<Integer> u:myMap.values()) ans.addAll(u);
        return ans;
    }
    static void leftViewMy(Node root){
        Map<Integer, Integer> myLeft = new HashMap<>();
        myLeft.put(0, root.data);
        int level = 0;
        myQueue.clear();
        myQueue.add(root); myQueue.add(null);
        while(myQueue.size() > 1){
            Node A = myQueue.poll();
            if(A == null){
                level++;
                myQueue.add(null);
                continue;
            }
            if(!myLeft.containsKey(level)){
                myLeft.put(level,A.data);
            }
            if(A.left != null) myQueue.add(A.left);
            if(A.right != null) myQueue.add(A.right);
        }
        for(int u:myLeft.values()) System.out.print(u + " ");
    }
    static void leftViewSir(Node root, int[] list, int level){
        if(root == null) return;
        if(list[level] == 0) list[level] =  root.data;
        leftViewSir(root.left,list,level+1);
        leftViewSir(root.right,list,level+1);
    }
    static void rightViewSir(Node root,int[] list, int level){
        if(root == null) return;
        if(list[level] == 0) list[level] = root.data;
        rightViewSir(root.right,list,level+1);
        rightViewSir(root.left,list,level+1);
    }
}
