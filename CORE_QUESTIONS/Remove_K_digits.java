class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length() == k) return "0";
        Stack<Integer> stack = new Stack<>();
        for(char ch:num.toCharArray()){
            int x = ch - '0';
            while(!stack.isEmpty() && x < stack.peek() && k!=0){
                stack.pop();
                k--;
            }
            stack.push(x);
        }
        while(k!=0){
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<stack.size();i++){
             sb.append(stack.get(i));
        }
        int z= 0;
        while(z < sb.length() - 1 && sb.charAt(z) == '0'){
            z++;
        }
        String s = sb.substring(z);
        return s;
    }
}