class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums1.length == 0 || nums2.length == 0 || k == 0) return result;

        // Min-heap: each element is {nums1_val, nums2_val, index_in_nums2}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (a[0] + a[1]) - (b[0] + b[1]));

        // Initialize heap with pairs (nums1[i], nums2[0])
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            pq.offer(new int[]{nums1[i], nums2[0], 0});
        }

        // Extract the smallest pairs until k pairs collected or pq empty
        while (k > 0 && !pq.isEmpty()) {
            int[] pair = pq.poll();
            result.add(Arrays.asList(pair[0], pair[1]));
            k--;

            int idx = pair[2];
            // If possible, push the next pair from nums2
            if (idx + 1 < nums2.length) {
                pq.offer(new int[]{pair[0], nums2[idx + 1], idx + 1});
            }
        }

        return result;
    }
}
