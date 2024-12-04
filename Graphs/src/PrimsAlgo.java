import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class pare implements Comparable<pare>{
    public int v, wt;
    pare(int v, int wt){
        this.v = v;
        this.wt = wt;
    }
    @Override
    public int compareTo(pare obj){
        if(this.wt > obj.wt) return 1;
        else return -1;
    }
}

public class PrimsAlgo{
    static int spanningTree(int v, int e, List<List<int[]>> obj){
        boolean[] visited = new boolean[v];
        PriorityQueue<pare> pq = new PriorityQueue<>();
        pq.add(new pare(0,0));
        pare curr;
        int ans = 0;
        while(pq.size() != 0){
            curr = pq.poll();
            if(visited[curr.v]) continue;
            ans += curr.wt;
            visited[curr.v] = true;
            for(int[] k:obj.get(curr.v)){
                if(!visited[k[0]]){
                    pq.add(new pare(k[0], k[1]));
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[][] temp = {{0 ,1, 5},{1,2,3},{0 ,2, 1}};
        List<List<int[]>> obj = new ArrayList<>();
        for(int i=0;i<3;i++) obj.add(new ArrayList<>());
        for (int[] s:temp){
            int a = s[0],  b = s[1], c = s[2];
            obj.get(a).add(new int[] {b, c});
            obj.get(b).add(new int[] {a, c});
        }
        System.out.println(spanningTree(3,3,obj));
    }
}
