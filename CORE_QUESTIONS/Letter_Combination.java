class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
       
       return pad("",digits);

    }
    static String map[] = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
    static List<String> pad(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        String letters = map[digit];
        ArrayList<String> list1 = new ArrayList<>();
        for(char c:letters.toCharArray()){
            list1.addAll(pad(p + c,up.substring(1)));
        }
        return list1;
    }
}