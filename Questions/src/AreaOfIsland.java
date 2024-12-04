public class AreaOfIsland{
    static int ans;
    static int islandLength(int[][] grid, int x, int y){
        if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || grid[x][y] == 0) return 0;
        grid[x][y] = 0;
        int a = islandLength(grid, x, y+1);
        int b = islandLength(grid, x, y-1);
        int c = islandLength(grid, x+1, y);
        int d = islandLength(grid, x-1, y);
        return a+b+c+d+1;
    }
    static void helper(int[][] grid){
        int i, j;
        for(i=0;i<grid.length;i++){
            for(j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1) ans = Math.max(ans, islandLength(grid, i, j));
            }
        }
    }
    public static void main(String[] args) {
        int[][] grid = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},{
                0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},{0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},{
                0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},{
                0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        ans = 0;
        helper(grid);
        System.out.println(ans);
    }
}
