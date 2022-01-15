package Stack;

public class NumberOfIsland {
    public static void main(String[] args) {
        String grid[][] = new String[][]{
                {"1","1","0","0","0"},
                {"1","1","0","0","0"},
                {"0","0","1","0","0"},
                {"0","0","0","1","1"}};
               getIsland(grid);
    }

    private static void getIsland(String [][] grid) {
            int row = grid.length;
            int col = grid[0].length;
            int island = 0;
            for(int i =0 ;i < row; i++){
                for(int j=0; j < col; j++){
                    if(grid[i][j].equals("1")){
                        dfs(grid, i, j);
                        island++;
                    }
                }
            }
            System.out.println(island);
    }

    private static void dfs(String[][] grid, int row, int col) {
           if(row < 0 || col < 0 || row > grid.length-1 || col > grid[0].length-1 || grid[row][col].equals("2") || grid[row][col].equals("0"))
               return;
           grid[row][col] = "2";
           dfs(grid, row+1, col);
           dfs(grid, row-1, col);
           dfs(grid, row, col+1);
           dfs(grid, row, col-1);
    }

}
