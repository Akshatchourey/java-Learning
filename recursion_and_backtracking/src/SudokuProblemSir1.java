public class SudokuProblemSir1{
    static boolean check(int[][] m, int x, int y, int num){
        // row
        for(int i=0;i<9;i++){
            if(m[x][i] == num){return false;}
        }
        // column
        for(int i=0;i<9;i++){
            if(m[i][y] == num){return false;}
        }
        // box
        int c=0; int d=0;
        if(x<3){c=0;} else if(x<6){c=3;} else if(x<9){c=6;}
        if(y<3){d=0;} else if(y<6){d=3;} else if(y<9){d=6;}
        for(int i=c;i<c+3;i++){
            for(int j=d;j<d+3;j++){
                if(m[i][j] == num){return false;}
            }
        }
        return true;
    }
    static boolean helper(int[][] m, int x, int y){
        if(x == 9){
            for(int[] k:m){
                for(int u:k){
                    System.out.print(u + " ");
                }
                System.out.println("");
            }
            return true;
        }
        if(y == 9){return helper(m,x+1,0);}

        if(m[x][y] != 0){return helper(m,x,y+1);}

        for(int i=1;i<=9;i++){
            if (check(m, x, y, i)){
                m[x][y] = i;
                if (helper(m, x,y + 1)){
                    return true;
                }
            }
            m[x][y] = 0;
        }
        return false;
    }
    public static void main(String[] args){
        int[][] m ={{0,0,0,5,0,0,3,0,0},
                {2,0,0,0,9,0,0,0,0},
                {3,0,4,0,6,0,1,0,5},
                {0,0,0,8,0,0,2,0,0},
                {0,0,0,9,1,6,0,0,0},
                {0,0,1,0,0,7,0,0,0},
                {7,0,3,0,0,0,8,0,1},
                {0,0,0,0,7,0,0,0,4},
                {0,0,8,6,0,4,0,0,0}};
        System.out.println(helper(m,0,0));
    }
}
