import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class DijkstrasAlgo{
    static int[] dijkstra(int v, ArrayList<ArrayList<ArrayList<Integer>>> obj, int s){
        PriorityQueue<pare> pq = new PriorityQueue<>();
        pq.add(new pare(s,0));
        boolean[] visited = new boolean[v];
        int[] ans = new int[v];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[s] = 0;
        pare curr; int currV, currWt;
        while(!pq.isEmpty()){
            curr = pq.poll();
            currV = curr.v; currWt = curr.wt;
            if(visited[currV]) continue;
            visited[currV] = true;
            for(ArrayList<Integer> k:obj.get(currV)){
                if(!visited[k.get(0)]){
                    pq.add(new pare(k.get(0), currWt+k.get(1)));
                }
                if(currWt+k.get(1) < ans[k.get(0)]) ans[k.get(0)] = currWt+k.get(1);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[][][] temp = {{{1, 1}, {2, 6}}, {{2, 3}, {0, 1}}, {{1, 3}, {0, 6}}};
        ArrayList<ArrayList<ArrayList<Integer>>> obj = new ArrayList<>();

        for (int[][] s:temp){
            ArrayList<ArrayList<Integer>> temp2 = new ArrayList<>();
            for(int[] k:s){
                ArrayList<Integer> temp1 = new ArrayList<>();
                temp1.add(k[0]);
                temp1.add(k[1]);
                temp2.add(temp1);
            }
            obj.add(temp2);
        }
        int[] ans = dijkstra(3, obj, 2);
        for(int k:ans) System.out.print(k + " ");
    }
}
