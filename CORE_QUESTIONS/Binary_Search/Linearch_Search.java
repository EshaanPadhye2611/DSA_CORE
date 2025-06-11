class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
         return this.efficientTargetIndices(nums, target);
    }

    public List<Integer> efficientTargetIndices(int[] nums, int target) {
      int countSmaller = 0, countTarget = 0;

    // Count how many elements are less than the target and equal to the target
    for (int number : nums) {
        if (number < target) {
            countSmaller++;
        } else if (number == target) {
            countTarget++;
        }
    }

    // Construct the result list of indices
    List<Integer> targetIndicesList = new ArrayList<>(countTarget);
    for (int i = 0; i < countTarget; i++) {
        targetIndicesList.add(countSmaller + i);
    }

    return targetIndicesList;
}
  
}