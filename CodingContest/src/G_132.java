import java.util.HashMap;

public class G_132{
    static int antiqueItems(int n, int[] a, int[] p){
        int no;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(a[i])){
                if(p[i] < map.get(a[i])) map.put(a[i], p[i]);

            }else{
                map.put(a[i], p[i]);
            }
        }
        int ans = 0;
        for(int k:map.values()) ans += k;
        return ans;
    }
    public static void main(String[] args){
        //Q1 Done
        System.out.println(antiqueItems(4, new int[]{1,2,2,3}, new int[]{3,4,5,6}));
        //Q2 not able to understand
        //Q3 unable to do
        int k = 5;

        String str = "paras@08:01:12";
        String[] st = str.split("@");
        HashMap<String, Integer> map = new HashMap<>();
        String[] time = st[1].split(":");
        int sec = 0;
        sec += Integer.parseInt(time[0])*60*60;
        sec += Integer.parseInt(time[1])*60;
        sec += Integer.parseInt(time[2]);
        if(map.containsKey(st[0])){
            if(sec-map.get(st[0])>= k) return ;
            return;
        }
        map.put(st[0], sec);
        return;
        //Q4 not even seen
    }
}
