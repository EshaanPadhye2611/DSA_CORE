class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int diff = Math.abs(a - x) - Math.abs(b - x);
            if (diff == 0) {
                return a - b;  
            }
            return diff;
        });

        for (int num : arr) {
            pq.offer(num);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(pq.poll());
        }

        Collections.sort(result);
        return result;
    }
}
