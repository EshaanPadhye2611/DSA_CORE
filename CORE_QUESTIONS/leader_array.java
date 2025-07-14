import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int maxFromRight = nums[n - 1];
        list.add(maxFromRight); // Last element is always a leader

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] >= maxFromRight) {
                maxFromRight = nums[i];
                list.add(maxFromRight);
            }
        }

        // Reverse to restore left-to-right order
        Collections.reverse(list);
        return list;
    }
}
