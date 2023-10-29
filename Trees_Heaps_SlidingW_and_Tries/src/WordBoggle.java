import java.util.*;

public class WordBoggle{
    static boolean checker(int x, int y, int idx, String s, char[][] A){
        if(x<0 || x==A.length || y<0 || y== A[0].length || B[x][y]==1 || s.charAt(idx)!=A[x][y]) return false;
        else if(idx == s.length()-1) return true;
        B[x][y] = 1;
        boolean f = checker(x-1,y-1,idx+1,s,A)||
                checker(x-1,y,idx+1,s,A)||
                checker(x-1,y+1,idx+1,s,A)||
                checker(x,y+1,idx+1,s,A)||
                checker(x+1,y+1,idx+1,s,A)||
                checker(x+1,y,idx+1,s,A)||
                checker(x+1,y-1,idx+1,s,A)||
                checker(x,y-1,idx+1,s,A);
        B[x][y] = 0;
        return f;
    }
    static int[][] B;
    public static void main(String[] args){
        String[] dict = {"QUIZ","GEEKS","FOR","GO"};
        char[][] A = {{'G','I','Z'},{'U','E','K'},{'Q','S','E'}};

        ArrayList<String> ans = new ArrayList<>();
        B = new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                for(String u:dict){
                    if(u.charAt(0) != A[i][j] || ans.contains(u)) continue;
                    if(checker(i,j,0,u, A)) ans.add(u);
                }
            }
        }
        Collections.sort(ans);
        String[] fans = new String[ans.size()];
        fans = ans.toArray(fans);
        System.out.println(Arrays.toString(fans));
    }
}
