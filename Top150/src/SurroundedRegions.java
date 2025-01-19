import java.util.Arrays;

public class SurroundedRegions{
    static char[][] ans;
    static void helper(char[][] graph, int x, int y){
        if(x<0 ||  y<0 || x==graph.length ||
                y==graph[0].length || graph[x][y] == 'X') return;
        graph[x][y] = 'X';
        ans[x][y] = 'O';
        helper(graph, x, y-1);
        helper(graph, x, y+1);
        helper(graph, x-1, y);
        helper(graph, x+1, y);
    }
    static void solve(char[][] graph){
        int n = graph.length, m = graph[0].length;
        ans = new char[n][m];
        for(int i=0;i<m;i++){
            if(graph[0][i] == 'O') helper(graph, 0, i);
            if(graph[n-1][i] == 'O') helper(graph, n-1, i);
        }
        for(int i=0;i<n;i++){
            if(graph[i][0] == 'O') helper(graph, i, 0);
            if(graph[i][m-1] == 'O') helper(graph, i, m-1);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ans[i][j] == 'O') graph[i][j] = 'O';
                else graph[i][j] = 'X';
            }
        }
    }
    public static void main(String[] args){
        char[][] graph = {{'X','X','O','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        solve(graph);
        System.out.println(Arrays.deepToString(graph));
    }
}
