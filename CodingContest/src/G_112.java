import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Quest implements Comparable<Quest>{
    int xpr; int xpg;
    public Quest(int xpr, int xpg){
        this.xpr = xpr; this.xpg = xpg;
    }

    @Override
    public int compareTo(Quest that){
        if(that.xpg == this.xpg && that.xpr<this.xpr) return 1;
        else if(that.xpg > this.xpg) return 1;
        else return -1;
    }
}
public class G_112{
    static boolean IsMean(int n, int k, int x, int arr[]){
        int sum = Arrays.stream(arr).sum();
        int c; int a;
        for(int i=0;i<n;i++){
            a = arr[i];
            for(int j=i+1;j<n;j++){
                c = sum + (a+arr[j])*k - (a+arr[j]);
                if(c == x*n) return true;
            }
        }
        return false;
    }
    static long MaxXP(int k, int i_xp,ArrayList<Quest> arr){
        long xp = i_xp; long xpInstance;
        while(k != 0){
            xpInstance = xp;
            for(Quest u:arr){
                if(u.xpr <= xp){
                    k--;
                    xp += u.xpg;
                    arr.remove(u);
                    break;
                }
            }
            if(xpInstance == xp) break;
        }
        return xp;
    }
    public static void main(String[] args){
        // Q1 Done (t/n == x) is not good --> (t == n*x) is good
        System.out.println(IsMean(10,10,16,new int[]{2,2,3,4,4,5,5,6,7,8}));
        // Q2 Done
        int n = 5;
        int i_exp = 10;
        int[] xpreq = {3,2,4,1,2};
        int[] xpgain = {5, 3, 6, 2, 4};
        int k = 3;
        ArrayList<Quest> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new Quest(xpreq[i], xpgain[i]));
        }
        Collections.sort(arr);
        System.out.println(MaxXP(k,i_exp,arr));
        // Q3 not done
//        it uses the concept's that I don't yet learn :-
//         Dynamic Programing, Binary Search Tree, Greedy Algo
    }
}
