

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        for (int a : aliceSizes) sumA += a;
        for (int b : bobSizes) sumB += b;

        int delta = (sumB - sumA) / 2;

        Arrays.sort(bobSizes); 

        for (int a : aliceSizes) {
            int b = a + delta;
            if (binarySearch(bobSizes, b)) {
                return new int[]{a, b};
            }
        }

        return new int[0]; // Should never reach here
    }

    // Standard binary search
    private boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
