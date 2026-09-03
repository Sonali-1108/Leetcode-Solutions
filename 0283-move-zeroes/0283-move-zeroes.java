class Solution {
    public void moveZeroes(int[] nums) {
        for(int j=0;j<nums.length;j++)
        {
        for(int i =1;i<nums.length;i++)
        {
            if(nums[i-1] == 0){
                int temp = nums[i-1];
                nums[i-1] = nums[i];
                nums[i] = temp;
            }
            
        }
        }
    }
}