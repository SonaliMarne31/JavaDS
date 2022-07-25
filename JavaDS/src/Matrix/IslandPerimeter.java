package Matrix;

public class IslandPerimeter {

    // BFS approach

    private int func(int i,int j,int r,int c,boolean[][] visit,int[][] grid) {
        // Boundary conditions or if we hit water, return
        if(i < 0 || i >=r ||j < 0 || j >= c || grid[i][j] == 0) {
            return 1;
        }
        // if already visited , return
        if(visit[i][j]) return 0;

        // else, mark current location as visited and move in all directions to check if we are on land or water
        // Calculate the perimeter as we move
        visit[i][j] = true;

        int ans = func(i+1,j,r,c,visit,grid);
        ans += func(i-1,j,r,c,visit,grid);
        ans += func(i,j+1,r,c,visit,grid);
        ans += func(i,j-1,r,c,visit,grid);
        
        return ans;
    }
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        // to store visited places
        boolean[][] visit = new boolean[grid.length][grid[0].length];
        
        // double loop to go on each location in the matrix

        for(int i = 0;i < grid.length ; i++) {
            for(int j = 0;j < grid[0].length ; j++) {
                // If we are on land, check if it island
                if(grid[i][j] == 1) {
                    return func(i,j,grid.length,grid[0].length,visit,grid);
                }
            }
        }
        return 0;
    }
}
