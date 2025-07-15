class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        ArrayList<Integer> list1 = new ArrayList<>();
         ArrayList<Integer> list2 = new ArrayList<>();

         for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                if(matrix[i][j] == 0){
                    list1.add(i);
                    list2.add(j);
                }
            }
         }

         for(int x:list1){
            for(int i = 0;i<c;i++){
                matrix[x][i] = 0;
            }
         }

         for(int x:list2){
            for(int i = 0;i<r;i++){
                matrix[i][x] = 0;
            }
         }
        
        
      
        
    }
}