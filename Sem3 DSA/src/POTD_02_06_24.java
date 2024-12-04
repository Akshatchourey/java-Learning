import java.util.ArrayList;
import java.util.Collections;

public class POTD_02_06_24 {
    public static void main(String[] args) {
        int q = 5;
        int[][] queries = {{0, 6}, {0, 3}, {0, 2}, {1, 4}, {1, 5}};

        ArrayList<Integer> ans = new ArrayList<>();
        int xor = 0;
        // query in reversed order gives ans

        int[] temp;
        for(int i=q-1;i>=0;i--){
            temp = queries[i];
            if(temp[0] == 0){
                ans.add(temp[1]^xor);
            }else{
                xor ^= temp[1];
            }
        }
        ans.add(xor);

        Collections.sort(ans);
        System.out.println(ans);
    }
}
