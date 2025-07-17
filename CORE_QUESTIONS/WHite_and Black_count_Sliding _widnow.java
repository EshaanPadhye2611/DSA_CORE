class Solution {
    public int myAtoi(String s) {
        if (s.length() == 0) return 0;

        StringBuilder sb = new StringBuilder();
        s = s.trim();
        boolean isNegative = false;

        if (s.length() == 0) return 0;

        if (s.charAt(0) == '-') {
            isNegative = true;
            s = s.substring(1);
        } else if (s.charAt(0) == '+') {
            s = s.substring(1);
        }

        extractNum(sb, s);

        if (sb.length() == 0) return 0;

        // Convert manually to avoid overflow
        long result = 0;
        for (int i = 0; i < sb.length(); i++) {
            result = result * 10 + (sb.charAt(i) - '0');
            if (!isNegative && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (isNegative && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }

        return isNegative ? (int)(-result) : (int)result;
    }

    static StringBuilder extractNum(StringBuilder sb, String s) {
        if (s.length() == 0) return sb;

        char ch = s.charAt(0);

        if (!Character.isDigit(ch)) return sb;

        // Skip leading zeros only if sb is empty
        if (ch == '0' && sb.length() == 0) {
            return extractNum(sb, s.substring(1)); // skip this zero
        }

        sb.append(ch);
        return extractNum(sb, s.substring(1));
    }
}
