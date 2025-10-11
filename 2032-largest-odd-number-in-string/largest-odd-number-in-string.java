class Solution {
    public String largestOddNumber(String num) {
        int largestOddIndex = -1;

        for (int i = 0; i < num.length(); i++) {
            if ((num.charAt(i) - '0') % 2 != 0) {
                largestOddIndex = i;
            }
        }

        return largestOddIndex == -1 ? "" : num.substring(0, largestOddIndex + 1);
    }
}
