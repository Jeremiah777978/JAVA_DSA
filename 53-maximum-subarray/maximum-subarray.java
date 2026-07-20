class Solution {
    public int maxSubArray(int[] nums) {
        int s1 = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) 
        {
         s1 = Math.max(s1 + nums[i], nums[i]);
        max = Math.max(s1, max);
   }

        return max;
    }
}