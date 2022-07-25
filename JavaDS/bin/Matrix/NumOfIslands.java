public class NumOfIslands {
    public int numIslands(char[][] grid) {
        
        int res = 0;

        // Loop rows and columns

        for(int i = 0; i < grid.length; i++ ){
            for(int j = 0; j < grid[0].length; j++){

                // If we hit land then go inside and find each direction
                if(grid[i][j] == '1'){
                    numIslands(grid,i,j);
                    res++;
                }
            }
        }
        return res;
    }
    
    public void numIslands(char[][] grid,int i,int j){
        // boundary conditions
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') return;
        
        grid[i][j] = '0';
        
        numIslands(grid, i+1, j);
        numIslands(grid, i-1, j);
        numIslands(grid, i, j+1);
        numIslands(grid, i, j-1);
    }
}
