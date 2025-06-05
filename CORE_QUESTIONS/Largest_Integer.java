class Solution {
    public int largestInteger(int num) {
        
        char[] digits = String.valueOf(num).toCharArray();
        if(digits.length == 1){
            return num;
        }

        PriorityQueue<Integer> oddpq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> evenpq = new PriorityQueue<>(Collections.reverseOrder());

        for(char c:digits){
            int d = c - '0';
            if(d % 2 == 0){
                evenpq.offer(d);
            }else{
                oddpq.offer(d);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c :digits){
            int f = c - '0';
            if(f % 2 == 0){
                sb.append(evenpq.poll());
            }else{
                sb.append(oddpq.poll());
            }
        }
        int result  = Integer.parseInt(sb.toString());
        return result;
        
    }
}