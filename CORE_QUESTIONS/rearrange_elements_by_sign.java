class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr1 = new int[nums.length / 2];
        int[] arr2 = new int[nums.length / 2];
        int[] arr3 = new int[nums.length];
        int index1 = 0;
        int index2 = 0;
        for(int x:nums){
            if(x > 0){
                arr1[index1++] = x;
            }else{
                arr2[index2++] = x;
            }
        }
        arr3[0] = arr1[0];
        arr3[1] = arr2[0];
        int i = 1;
        int j = 1;
        if(arr3.length > 2){
        for(int k = 2;k<nums.length;k++){
            if(arr3[k-1] > 0){
                arr3[k] = arr2[j];
                j++;
            }else{
                arr3[k] = arr1[i];
                i++;
            }

        }
        }
        return arr3;
         
    }
}