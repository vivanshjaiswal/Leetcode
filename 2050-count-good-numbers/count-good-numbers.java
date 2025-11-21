class Solution {

    private long power(long x, long n, long mod) {
        long result = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                result = (result * x) % mod;
            }
            x = (x * x) % mod;
            n >>= 1;
        }
        return result;
    }

    public int countGoodNumbers(long n) {
        long mod = 1000000007;

        long odd = n / 2;              // odd positions
        long even = odd + (n % 2);     // even positions

        long p1 = power(5, even, mod);
        long p2 = power(4, odd, mod);

        return (int) ((p1 * p2) % mod);
    }
}
