class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
       List<Integer> list  = new ArrayList<>();
       for(int i = 0;i<asteroids.length;i++){
        if(asteroids[i] > 0) stack.push(asteroids[i]);
       else{
        while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroids[i])){
            stack.pop();
        }
       
        if(!stack.isEmpty() && stack.peek() == Math.abs(asteroids[i]))  stack.pop();
           
        else if(stack.isEmpty() || asteroids[i] < 0 && stack.peek() < 0)   stack.push(asteroids[i]);

        }
       }
        for(int i = 0;i<stack.size();i++){
            list.add(stack.get(i));
        }
       int[] arr = new int[list.size()];
       int idx = 0;
       for(int x:list){
           arr[idx] = x;
           idx++;
       }
       return arr;
       } 
       
        
    }
