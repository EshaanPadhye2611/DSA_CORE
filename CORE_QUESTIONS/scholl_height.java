class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = new int[heights.length];
        int idx = 0;
        for(int x:heights){
            arr[idx++] = x;
        }
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0;i<heights.length;i++){
            if(heights[i] != arr[i]){
                count++;
            }
        }
        return count;
    }
}