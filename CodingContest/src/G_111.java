public class G_111{
    public static void main(String[] args){
        // Q1 Done
        // Q2 Done
        int n = 8;
        int[] arr = {-1,0,0,0,0,2,2,5};
        int[] c = new int[n];
        for(int i=1;i<n;i++) c[arr[i]]++;
        int ans = 0;
        for(int u:c) if(u > 0) ans++;
        if(c[0] < 2) ans--;
        System.out.println(Math.max(0,ans-1));
        // Q3 notDone Trie question (studying not studied)
    }
}
