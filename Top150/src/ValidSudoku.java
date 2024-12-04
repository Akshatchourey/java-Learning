import java.util.HashSet;
import java.util.Set;

public class ValidSudoku{
    static boolean checker(char[][] arr, int c, int d){
        Set<Character> mySet = new HashSet<>();
        char curr;
        for(int i=c;i<c+3;i++){
            for(int j=d;j<d+3;j++){
                curr = arr[i][j];
                if(curr == '.') continue;
                if(mySet.contains(curr)) return false;
                mySet.add(curr);
            }
        }
        return true;
    }
    static boolean isValidSudoku(char[][] arr){
        Set<Character> mySet = new HashSet<>();
        for(int i=0;i<9;i++){
            char curr;
            mySet.clear();
            for(int j=0;j<9;j++){
                curr = arr[i][j];
                if(curr == '.') continue;
                if(mySet.contains(curr)) return false;
                mySet.add(curr);
            }
        }
        for(int i=0;i<9;i++){
            char curr;
            mySet.clear();
            for(int j=0;j<9;j++){
                curr = arr[j][i];
                if(curr == '.') continue;
                if(mySet.contains(curr)) return false;
                mySet.add(curr);
            }
        }
        for(int c=0;c<9;c+=3){
            for(int d=0;d<9;d+=3){
                if(!checker(arr, c, d)) return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
    }
}
