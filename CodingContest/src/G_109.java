import java.util.HashMap;
import java.util.Map;

public class G_109{
    public static void main(String[] args){
        // Q1 done took more time, because of int-long thing(full screen mode).
        // Q2 no logic wrong code
/*        int [] arr = {2,1,3,1,2,1,3,2,1};
        Map<Integer,Integer> myMap = new HashMap<>();
        int ans = 0; int x = 1; int k = 2;
        for(int u:arr){
            if(myMap.containsKey(u)){
                if(u==x && myMap.get(u)==k){
                    myMap.put(x, 1);
                }
                ans += myMap.get(u);
                myMap.put(u, myMap.get(u)+1);
            }else{
                myMap.put(u,1);
            }
        }
        System.out.println(ans);*/
        // Q3 unable to do, it is from(heap, priority-queue, etc...not studied ) I am sad.
    }
}
