class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = Integer.MIN_VALUE;
        double value = Integer.MIN_VALUE;
        int area = 1;
        double ans = 0;
        for(int i = 0;i<dimensions.length;i++){
          int length = dimensions[i][0];
          int breadth = dimensions[i][1];
          ans = Math.sqrt((length * length) + (breadth * breadth));
          area = length * breadth;
          if(value < ans){
            maxArea = area;
          }
          if(value == ans){
            maxArea = Math.max(maxArea,area);
          }
          value = Math.max(value,ans);
          
    
    }
     return maxArea;
}
}