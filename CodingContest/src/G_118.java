import java.util.*;

public class G_118{
    static int findMin(int[] arr, int n){
        long sum = 0; int ans = Integer.MAX_VALUE; int evenNo;
        for(int u:arr){
            sum += u;
            if(u%2 == 0){
                evenNo = u; int temp = 0;
                while(evenNo%2 == 0){
                    evenNo /= 2; temp++;
                    if(temp >= ans) break;
                }
                if(temp < ans) ans = temp;
            }
        }
        if(sum%2 == 0) return 0;
        else if(ans != Integer.MAX_VALUE) return ans;
        return -1;
    }
    static int maxBoxes(int n, int k, int c, int[] col){
        int ans = 0, sum, x, y, count;
        for(int i=0;i<n-1;i++){
            if(col[i] != c || col[i] != col[i+1]) continue;
            sum = 2;
            x = i-1;
            y = i+2;
            while(0 <= x && y < n && col[x] == col[y]){
                count = 2;
                x--; y++;
                if(0 <= x && col[x] == col[x+1]){
                    count++;
                    x--;
                }
                if(y < n && col[y] == col[y-1]){
                    count++;
                    y++;
                }

                if(count >= 3) sum += count;
                else break;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
    static long countTriplet(int n, int[] arr,int x){
        long ans = 0; int validK, validI = 0;
        ArrayList<Integer> oddIdx = new ArrayList<>();
        for(int i=0;i<n;i++) if(arr[i]%2 != 0) oddIdx.add(i);
        for(int j:oddIdx){
            int kIdx = oddIdx.indexOf(j)+1;
            while(oddIdx.get(validI) <= j-x) validI++;
            while(kIdx<oddIdx.size() && oddIdx.get(kIdx) < j+x) kIdx++;
            validK = oddIdx.size()-kIdx;
            ans += (long)validK*validI;
        }
        return ans;
    }

    public static void main(String[] args){
        // Q1 Done
        System.out.println(findMin(new int[]{1, 1, 2}, 3));

        // Q2 Done
        System.out.println(maxBoxes(6,2,2, new int[]{1,1,2,2,1,1}));

        // Q3 Not seen (I am really sad because first done in 7 attempt and still not able to make to done within time. 8:30:02)
        // 4 different code written all of them give TLE Error.
        int x = 1;
        int[] A = {3, 3, 9, 9, 6, 2, 9};
        System.out.println(countTriplet(7, A, x));
    }
}
