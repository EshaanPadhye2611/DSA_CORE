class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
       int start = 0;
       int end = 0 ;
       int k =0;
     
       List<Integer> list = new ArrayList<>();
         int[] arr = new int[list.size()]
       while(start < nums1.length || end< nums2.length){
        if(nums1[start] == nums[end]){
            list.add(nums1[start]);
            start++;
            end++;

        }
        else if(nums1[start] < nums2[end]){
            if(list.contains(nums1[start])){
                if(list.contains(nums2[end]){
                    
                })
                list.add(nums2[end]);
                end++;
            }
            else{
            list.add(nums1[start]);
            start++;
            }
        }
        else {
            if(list.contains(nums2[end])){
                if(list.contains(nums1[start]){
                    continue;
                })
                list.add(nums1[start];)
                start++;
            }

            else{
            list.add(nums2[end]);
            end++;
            }
        }
       }
       
       for(int x :list){
           arr[k] = x
           k++;
       }
       return arr;
       
    }
}