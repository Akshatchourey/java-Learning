import java.util.ArrayList;
import java.util.Arrays;

public class G_110{
    // Q1 done (full-screen mode).
    // Q2 done

    // Q3 tLE error 2.06sec ??
    static int helper(int x, int c, ArrayList<String> arr, int k){
        if(x == arr.size()){
            if(c == 0) return 1;
            return 0;
        }
        if(c < 0 || c > k) return 0;
        if(arr.get(x).equals("(")) return helper(x+1,c+1,arr,k);
        else if(arr.get(x).equals(")")) return helper(x+1,c-1,arr,k);
        return helper(x+1,c+1,arr,k)+helper(x+1,c-1,arr,k);
    }
    public static void main(String[] args) {
        int n = 6;
        String str = "((??))";
        int k = 3;
        ArrayList<String> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(str.split("")));
        System.out.println(helper(0,0,arr,k));
    }
}
