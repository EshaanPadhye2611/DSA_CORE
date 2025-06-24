class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int  i =0;i<grid.length;i++){
            int rows = 0;
            int cols = grid[i].length - 1;
            while(rows < grid.length && cols >=0){
                int mid = rows + (cols - rows) / 2;
                if(grid[i][mid] < 0){
                    count++;
                    
                }else if(grid[i][mid] >= 0){
                    rows = mid + 1;
                }
            }
            

        }
        return count;
        
    }
}