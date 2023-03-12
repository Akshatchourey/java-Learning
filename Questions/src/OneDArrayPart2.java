import java.util.*;

public class OneDArrayPart2{
    /*
    public static boolean canWin(int leap, int[] game,int index){
        int n=game.length;
        if(index==n-1 || index+leap>=n){
            return true;
        }
        else if(index+leap<n && game[index+leap] == 0){
            return canWin(leap, game, index+leap);
        }
        else if(index+1<n && game[index+1] == 0){
            return canWin(leap, game, index+1);
        }
        else if(index-1>0 && game[index-1] == 0){
            int i = index;
            while(i>index-leap){
                if(i+leap<n && game[i+leap] == 0){
                    return canWin(leap, game, i+leap);
                }else{
                    if(i-1>0 && game[i-1] == 0){
                        i -= 1;
                    }
                    else{
                        return false;
                    }
                }
            }
            return false;
        }
        else{
            return false;
        }
    }/*


     */
    public static boolean canWin(int leap, int[] game,int index){
        int n=game.length;
        if(index<0 || game[index] == 1){return false;}
        if(index == n-1 || index+leap>=n){return true;}
        game[index] = 1;
        return canWin(leap, game, index+1) || canWin(leap, game, index-1) || canWin(leap, game, index+leap);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            System.out.println((canWin(leap, game, 0)) ? "YES" : "NO");
        }
    }
}
