public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        int counter = 0;
        while (counter++ < 32) {
            result <<= 1;
            result |= n & 1;
            n >>>= 1;
        }
        return result;
    }
}
