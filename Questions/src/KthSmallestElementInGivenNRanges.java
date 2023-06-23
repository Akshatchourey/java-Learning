import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class KthSmallestElementInGivenNRanges{
    static void columnWiseSorting(int[][] range){
        Arrays.sort(range, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] > o2[0]){return 1;}
                else return -1;
            }
        });
    }
    public static void main(String[] args){
        int[][] range = {{2, 6}, {5, 7}};
        int[] queries = {5,8};
        int n = range.length; int q = queries.length;

        columnWiseSorting(range);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<q;i++){
            int currentQuery = queries[i];
            int ans = -1; int foundElement = 0; int newFoundElement;
            int a; int b;
            for(int j=0;j<n;j++){
                a = range[j][0];
                b = range[j][1];
                if(j != 0){
                    int lastB = range[j-1][1];
                    if(lastB == a){a += 1;}
                    else if(lastB > a){a = lastB + 1;}
                }
                newFoundElement = b-a+1;
                foundElement += newFoundElement;
                if(foundElement > currentQuery){
                    ans = b-(foundElement-currentQuery);
                    break;
                }
                else if(foundElement == currentQuery){
                    ans = b;
                    break;
                }
            }
            arr.add(ans);
        }
        System.out.println(arr);
    }
}
