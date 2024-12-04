import java.util.ArrayList;

public class G_163{
    static int maximiseExpression(int n, int[] arr){
        int c = Math.min(arr[0], Math.min(arr[1], arr[2]));
        int b = Math.max(arr[0], Math.max(arr[1], arr[2]));
        int a = arr[0]+arr[1]+arr[2]-c-b;
        int k;
        for(int i=3;i<n;i++){
            k = arr[i];
            if(k < c) c = k;
            else{
                if(k > b){
                    a = b;
                    b = k;
                }
                else if(k > a) a = k;
            }
        }
        return (a+b)-c;
    }
    static ArrayList<Integer> getLinkage(int n, int[][] tree1, int[][] tree2){
        ArrayList<Integer> ans = new ArrayList<>();

        return ans;
    }
    public static void main(String[] args){
        // Q1 Done
        System.out.println(maximiseExpression(5, new int[]{1,5,3,2,4}));
        // Q2 Difficult
        // Q3 Not Seen
        // Q4 Understood, but how to do, can't keep it open
        System.out.println(getLinkage(4, new int[][]{{0, 1},{1,2},{2,3}}, new int[][]{{0,1},{1,2},{1,3}}));
        int s=9, d=2;
        int temp2 = (s-d)-8*((s-d)/8);
        StringBuilder str = new StringBuilder();
        if(temp2>0){
            str.append(temp2+1);
        }
        System.out.println(str);
    }
}
