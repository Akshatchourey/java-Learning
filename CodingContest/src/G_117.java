public class G_117{
    /*static int mean(Node root, int key){
        int s = -1; int l = -1;
        Node cur = root;
        while(cur != null){
            if(cur.data == key) return key;
            else if(cur.data > key){
                l = cur.data;
                cur = cur.left;
            }
            else{
                s = cur.data;
                cur = cur.right;
            }
        }
        return (s+l+1)/2;
    }*/
    public static void main(String[] args){
        // Q1 Done
        int ans = 0;
        String s = "11001100";
        for(char u:s.toCharArray()) if(u == '0') ans++;
        if(ans%2 == 0) System.out.println("Yes");
        else System.out.println("No");

        // Q2 Done
//        System.out.println(mean(root, 2));
        // Q3 Out of range of my knowledge(Graphs).
    }
}
