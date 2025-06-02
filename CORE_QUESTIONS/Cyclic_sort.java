public class Cyclic_sort {
    public static void cyclicSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            while(i != nums[i] - 1){
                int correct = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }

        }

    }
    public static void main(String[] args) {
        int[] nums = {5, 3, 1, 2, 4};
        cyclicSort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
}
