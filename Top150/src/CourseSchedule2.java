import java.util.*;

public class CourseSchedule2{
    static int[] findOrder(int n, int[][] pq){
        Map<Integer, List<Integer>> adj = new HashMap<>();
        int[] inDegree = new int[n];
        for(int[] k:pq){
            List<Integer> temp = adj.getOrDefault(k[1], new ArrayList<>());
            temp.add(k[0]);
            adj.put(k[1], temp);
            inDegree[k[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        int[] ans = new int[n];
        int i = 0;
        for(int j=0;j<n;j++) if(inDegree[j] == 0) q.offer(j);

        while(!q.isEmpty()){
            int curr = q.poll();
            ans[i++] = curr;
            if(adj.containsKey(curr)){
                for(int k:adj.get(curr)){
                    inDegree[k]--;
                    if(inDegree[k] == 0) q.offer(k);
                }
            }
        }

        if(i == n) return ans;
        return new int[0];
    }
    static int[] findOrder2(int n, int[][] pq){
        List<Integer>[] adj = new List[n];
        int[] inDegree = new int[n];

        for(int[] k:pq){
            if(adj[k[1]] == null) adj[k[1]] = new ArrayList<>();
            adj[k[1]].add(k[0]);
            inDegree[k[0]]++;
        }
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> myQueue = new LinkedList<>();
        for(int i=0;i<n;i++) if(inDegree[i] == 0) myQueue.offer(i);

        while(!myQueue.isEmpty()){
            int curr = myQueue.poll();
            ans.add(curr);
            if(adj[curr] != null){
                for(int k:adj[curr]){
                    inDegree[k]--;
                    if(inDegree[k] == 0) myQueue.offer(k);
                }
            }
        }
        if(ans.size() != n) return new int[0];
        return ans.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args){
    }
}
