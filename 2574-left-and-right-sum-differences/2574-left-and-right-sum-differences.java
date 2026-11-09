class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[]leftSum = new int[n];
        int[]rightSum = new int[n];
         int[]answer = new int[n];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
           leftSum[i] += nums[j];
            }
        for(int j=i+1;j<n;j++){
            rightSum[i] += nums[j];
        }
       
        answer[i] = Math.abs(leftSum[i] - rightSum[i]);
       
    }
     return answer;
}
}