class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;
        int sign = 1; // default should be +1
        int result = 0;

        // 1️⃣ Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2️⃣ Handle sign (+ or -)
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {  // <-- parentheses fixed
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3️⃣ Convert digits to integer
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // 4️⃣ Check for overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        // 5️⃣ Apply sign
        return result * sign;
    }
}
