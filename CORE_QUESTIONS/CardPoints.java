class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int sum = 0;
       int result = Integer.MIN_VALUE;
       for(int i = 0;i<k;i++){
        sum += cardPoints[i];
       }
       int total = sum;
       result = sum;
       for(int i = 1;i<=k;i++){
        total -= cardPoints[k - i];
        total += cardPoints[cardPoints.length - i];
        result = Math.max(result,total);
        
       }
       return result;
    }
}