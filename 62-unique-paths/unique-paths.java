class Solution {
    public int uniquePaths(int m, int n) {
        return combination(m + n - 2, m - 1);
    }

    private int combination(int total, int select) {
        long res = 1;
        for (int i = 1; i <= select; i++) {
            res = res * (total - select + i) / i;
        }
        return (int) res;
    }
}
