class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        int[] arr = new int[n];

        // Step 1: String ko int array me convert karna
        for (int i = 0; i < n; i++) {
            arr[i] = num.charAt(i) - '0';
        }

        // Step 2: Last digit odd check
        if (arr[n - 1] % 2 != 0) {
            return num; // poora number odd hai
        }

        // Step 3: Loop se largest odd index dhundna
        int largestOddIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                largestOddIndex = i;
            }
        }

        // Step 4: Result return
        if (largestOddIndex == -1) {
            return ""; // koi odd number nahi
        } else {
            return num.substring(0, largestOddIndex + 1);
        }
    }
}
