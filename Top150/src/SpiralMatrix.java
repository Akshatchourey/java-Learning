import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix{
    static List<Integer> spiralOrder(int[][] arr){
        List<Integer> ans = new ArrayList<>();
        int a=0, b=arr[0].length-1, c=0, d=arr.length-1;
        while(b>=a && d>=c){
            for(int i=a;i<=b;i++) ans.add(arr[c][i]);
            c++;
            if(d>=c) for(int i=c;i<=d;i++) ans.add(arr[i][b]);
            b--;
            if(b>=a) for(int i=b;i>=a;i--) ans.add(arr[d][i]);
            d--;
            if(d>=c) for(int i=d;i>=c;i--) ans.add(arr[i][a]);
            a++;
        }
        return ans.subList(0, arr.length*arr[0].length);
    }
    public static void main(String[] args){
        System.out.println(spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}
