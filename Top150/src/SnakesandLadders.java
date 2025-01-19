import java.util.*;

public class SnakesandLadders{
    static int snakesAndLadders(int[][] board){
        int n = board.length, moves = 0;
        Queue<Integer> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        q.offer(1);
        visited[n-1][0] = true;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int curr = q.poll();
                if(curr == n*n) return moves;
                for(int dice=1;dice<=6;dice++){
                    if(curr+dice > n*n) break;

                    int r = n - (curr+dice-1)/n -1;
                    int c = (curr+dice-1) %n;
                    if((r&1) == (n&1)) c = n - c -1;
                    if(!visited[r][c]){
                        visited[r][c] = true;
                        if(board[r][c] == -1) q.offer(curr+dice);
                        else q.offer(board[r][c]);
                    }
                }
            }
            moves++;
        }
        return -1;
    }
    public static void main(String[] args){
    }
}
