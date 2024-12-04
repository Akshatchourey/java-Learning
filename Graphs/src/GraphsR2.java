import java.util.*;

class Graphs2{
    int v, e;
    ArrayList<ArrayList<Integer>> obj = new ArrayList<>();

    Graphs2(int v, int e){
        this.e = e;
        this.v = v;
        for(int i = 0; i<v+1; i++) obj.add(new ArrayList<>());
    }

    void addEdge(int source, int dest){
        obj.get(source).add(dest);
        obj.get(dest).add(source);
    }
    void addEdgeDirected(int source, int dest){
        obj.get(source).add(dest);
    }
    void print(){
        for(ArrayList<Integer> k:obj) System.out.println(k);
    }

    boolean bfs(int src, int desc, int[] dist, int[] pred){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[v+1];
        for(int i=0;i<v;i++){
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }
        visited[0] = true;
        visited[src] = true;
        dist[src] = 0;
        queue.add(src);
        int cur;
        while(!queue.isEmpty()){
            cur = queue.remove();
            System.out.print(cur + " ");
            for(int neighbor: obj.get(cur)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.add(neighbor);
                    dist[neighbor] = dist[cur]+1;
                    pred[neighbor] = cur;

//                    if(neighbor == desc) return true;
                }
            }
        }

        return false;
    }
    void dfs(int src, boolean[] visit, ArrayList<Integer> ans){
        if(visit[src]) return ;
        visit[src] = true;
        ans.add(src);
        for(int neighbor: obj.get(src)){
            if(!visit[neighbor]){
                dfs(neighbor, visit, ans);
            }
        }
    }

    boolean isCycle(int src, int parent,  boolean[] visited){
        visited[src] = true;
        for(int neighbor: obj.get(src)){
            if(visited[neighbor] && neighbor != parent){
                return true;
            } else{
                if(isCycle(neighbor,src,visited)) return true;
            }
        }
        return false;
    }
    boolean isCycleDirected(int src, boolean[] visited, boolean[] currStack){
        visited[src] = true;
        currStack[src] = true;
        for(int neighbor:obj.get(src)){
            if(!visited[neighbor]){
                if(isCycleDirected(neighbor,visited,currStack)) return true;
            }
            else if(currStack[neighbor]) return true;
        }
        currStack[src] = false;
        return false;
    }
    void topoSortDFS(int src, boolean[] visited, Stack<Integer> myStack){
        visited[src] = true;
        for(int neighbor:obj.get(src)){
            if(!visited[neighbor]){
                topoSortDFS(neighbor, visited, myStack);
            }
        }
        myStack.push(src);
    }
    void topoSortBFS(int[] inDeg, Queue<Integer> myQueue){
        int no;
        while(!myQueue.isEmpty()){
            no = myQueue.poll();
            System.out.print(no + " ");
            for(int neighbour:obj.get(no)){
                inDeg[neighbour]--;
                if(inDeg[neighbour] == 0) myQueue.add(neighbour);
            }
        }
    }
}
public class GraphsR2{
    public static void main(String[] args){
//        Graphs2 test = new Graphs2(6, 8);
//        int[][] connect = new int[][]{{1,2},{1,3},{1,5},{2,5},{3,4},{4,5},{4,6},{5,6}}; //connections
//        Graphs2 test = new Graphs2(7, 8);
//        int[][] connect = new int[][]{{0,4},{0,1},{1,2},{1,3},{2,5},{5,6},{6,3},{3,4}}; //Graph 2
//        for(int[] k:connect) test.addEdge(k[0], k[1]);

        Graphs2 test = new Graphs2(6, 8);
        int[][] connect = new int[][]{{0,3},{0,2},{2,3},{2,1},{3,1},{5,1},{5,4},{1,4}}; //Graph 3
        for(int[] k:connect) test.addEdgeDirected(k[0], k[1]);
//        test.print();
/*
    // BFS
        int[] dist = new int[7];
        int[] pred = new int[7];
        System.out.print("Bfs of the graph is: ");
        test.bfs(1,6, dist, pred);
        System.out.println("");
    // DFS
        ArrayList<Integer> dfsArray = new ArrayList<>();
        boolean[] visit = new boolean[test.v];
        int noG = 0;    // numbers of Disconnected Graphs
        for(int i=0;i<test.v;i++) {
            if(!visit[i]){
                noG++;
                test.dfs(i, visit, dfsArray);
            }
        }
        System.out.println("Dfs of the graph is: " + dfsArray);
        System.out.println("Numbers of Disconnected Graphs " + noG);
   // cycle in un-directed graphs
        boolean[] visited = new boolean[test.v];
        boolean y;
        for(int i=0;i<test.v;i++) {
            if(!visit[i]){
                y = test.isCycle(i, -1,visited);
                if(y) System.out.println("1");
            }
        }
    // cycle in directed graphs
        visited = new boolean[test.v];
        boolean[] currStack = new boolean[test.v];
        for(int i=0;i<test.v;i++){
            if(!visited[i]){
                if(test.isCycleDirected(i,visited,currStack)){
                    System.out.println("1");
                    break;
                }
            }
        }
    // Topological Sorting
        visited = new boolean[test.v];
        Stack<Integer> myStack = new Stack<>();
        for(int i=0;i<test.v;i++){
            if(!visited[i]) test.topoSortDFS(i,visited,myStack);
        }
        int[] ans = new int[test.v]; int i = test.v;
        for(int k:myStack) ans[--i] = k;
        System.out.println("Topological sorting of the graph is: " + Arrays.toString(ans));

    // Kahn's algo - Topological sorting using bfs.
        int[] inDeg = new int[test.v];
        for(ArrayList<Integer> k:test.obj){
            for(int l:k) inDeg[l]++;
        }
        Queue<Integer> myQueue = new LinkedList<>();
        for(int i=0;i<test.v;i++){
            if(inDeg[i] == 0) myQueue.add(i);
        }
        test.topoSortBFS(inDeg, myQueue);
*/

    }
}
