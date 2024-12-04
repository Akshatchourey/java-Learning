class Graphs1{
    int e, v;
    int[][] graph = new int[v+1][e+1];

    Graphs1(int e, int v){
        this.e = e;
        this.v = v;
    }
    void addEdge(int[][] adj, int source, int dest){
        adj[source][dest] = 1;
        adj[dest][source] = 1;
    }
}
public class GraphsR1 {
    public static void main(String[] args){

    }
}
