import java.util.*;

public class courseSchedule{
    // 7ms
    static boolean canFinish(int n, int[][] arr){
        List<Integer>[] adj = new List[n];
        int[] inDegree = new int[n];

        for(int[] k:arr){
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
        return ans.size() == n;
    }
    // 9ms
    static boolean canFinish2(int n, int[][] arr){
        Map<Integer, List<Integer>> myMap = new HashMap<>();
        Queue<Integer> myQueue = new LinkedList<>();
        int ans = 0;
        int[] inDegree = new int[n];
        for(int[] k:arr){
            List<Integer> temp = myMap.getOrDefault(k[1], new ArrayList<>());
            temp.add(k[0]);
            myMap.put(k[1], temp);
            inDegree[k[0]]++;
        }
        for(int i=0;i<n;i++) if(inDegree[i] == 0) myQueue.offer(i);
        while(!myQueue.isEmpty()){
            int curr = myQueue.poll();
            ans++;
            if(myMap.containsKey(curr)){
                for(int k:myMap.get(curr)){
                    inDegree[k]--;
                    if(inDegree[k] == 0) myQueue.offer(k);
                }
            }
        }
        return ans == n;
    }
    public static void main(String[] args){
        System.out.println(canFinish2(2, new int[][]{{1,0}}));
    }
}
