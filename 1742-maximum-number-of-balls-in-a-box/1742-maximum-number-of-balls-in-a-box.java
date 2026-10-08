class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] count = new int[46];
        int max = 0;

        while (lowLimit <= highLimit) {

            int idx = 0;
            int num = lowLimit;

            while (num != 0) {
                idx += num % 10;
                num /= 10;
            }

            count[idx]++;
            lowLimit++;
        }

        for (int num : count) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}