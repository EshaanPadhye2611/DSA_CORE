
class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int result = 0;
        map.put('I',1);
        map.put('V',5);
        map.put('L',50);
         map.put('X',10);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int p1 = 0;
        for(int i =s.length()-1;i>=0;i--){
            int c1 = map.get(s.charAt(i));
            if(c1 < p1){
               result = result - c1;
            }else{
                result = result + c1;
            }
            p1 = c1;
        }
       
          
             
        
        return result;
        
    }
}