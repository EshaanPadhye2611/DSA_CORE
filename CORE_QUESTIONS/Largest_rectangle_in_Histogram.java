class Solution {
    public int largestRectangleArea(int[] heights) {
          int result = 0;
        Stack<Integer> nse = new Stack<>();
        int[] arr1 = new int[heights.length];
        for(int i = heights.length - 1;i>=0;i--){
            while(!nse.isEmpty() && heights[i] <= heights[nse.peek()]){
                nse.pop();
            }
            if(nse.isEmpty()){
                arr1[i] = heights.length;
            }
            else{
                arr1[i] = nse.peek();
            }


            nse.push(i);
        }

        Stack<Integer> pse = new Stack<>();
        int[] arr2 = new int[heights.length];
        for(int i = 0;i<heights.length;i++){
            while(!pse.isEmpty() && heights[i] <= heights[pse.peek()]){
                pse.pop();
            }
            if(pse.isEmpty()){
                arr2[i] = -1;
            }
            else{
                arr2[i] = pse.peek();
            }


            pse.push(i);
        }
      

        for(int i = 0;i<heights.length;i++){
            int area = heights[i] * (arr1[i] - arr2[i] - 1);
            result  = Math.max(result,area);
        }
        return result;
    }
}