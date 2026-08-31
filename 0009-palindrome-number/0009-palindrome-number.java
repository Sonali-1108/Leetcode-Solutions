class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int original = x;
        int result = 0;
        int remainder;

        while (x > 0) {
            remainder = x % 10;
            result = result * 10 + remainder;
            x = x / 10;
        }
        return result == original;
    }
}