class Solution {
    public int[] getConcatenation(int[] nums) {
       // Approach 1: 

       /*  int[] result = new int[2*nums.length];
        System.arraycopy(nums,0,result,0);
        System.arraycopy(nums,nums.length,result,nums.length) */

        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        
        return ans;
            
        }
}