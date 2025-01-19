public class WordSearch{
    static boolean check(int i, int j, int idx, String w, char[][] b, int[][] visited){
        if(idx == w.length()) return true;
        if(i<0 || i==b.length || j<0 || j==b[0].length ||
                visited[i][j] == 1 || b[i][j] != w.charAt(idx)) return false;
        visited[i][j] = 1;
        if(check(i,j-1,idx+1,w,b,visited) ||
                check(i,j+1,idx+1,w,b,visited) ||
                check(i-1,j,idx+1,w,b,visited) ||
                check(i+1,j,idx+1,w,b,visited)) return true;
        visited[i][j] = 0;
        return false;
    }
    static boolean exist(char[][] b, String w){
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                if(b[i][j] == w.charAt(0) &&
                check(i, j, 0, w, b, new int[b.length][b[0].length])){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCCED"));
    }
}
