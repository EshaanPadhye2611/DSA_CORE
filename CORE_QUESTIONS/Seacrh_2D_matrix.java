class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0;i<matrix.length;i++){
            int rows = 0;
            int cols = matrix[i].length - 1;
            while(rows <= cols){
                int mid  = rows + (cols - rows) / 2;
                if(matrix[i][mid] == target) return true;
                else if(matrix[i][mid] < target) rows = mid + 1;
                else{
                    cols = mid  - 1;
                }
            }
        }
        return false;
    }
}