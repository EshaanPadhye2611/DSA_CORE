class Solution {
    public int firstUniqChar(String s) {
        if(s.length() == 1) return 0;
       HashMap<Character,Integer> map = new HashMap<>();
       HashMap<Character,Integer> map1 = new HashMap<>();

       for(char ch: s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0) + 1);
       }

       for(Map.Entry<Character,Integer> entry:map.entrySet()){
        char ch = entry.getKey();
        int n = entry.getValue();
        if(n == 1) map1.put(ch,n);
       }
       if(map1.isEmpty()) return -1;

       for(int i = 0;i<s.length();i++){
        if(map1.containsKey(s.charAt(i))){
            return i;
        }
       }
       
       return -1;
    }
}