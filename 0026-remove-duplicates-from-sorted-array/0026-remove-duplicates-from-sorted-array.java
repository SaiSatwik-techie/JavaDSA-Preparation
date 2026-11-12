class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int k = 0;
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i]!=nums[i+1]){
                nums[k++]=nums[i];
            }
        }
        //here in my approach the last element was remained each time so i explicitly included it
        //But it can also written in a way like
        /* for(int i=1;i<arr.length;i++){
                if(nums[i]!=nums[i-1]){
                    nums[k++] = nums[i];
                }
        }*/
        nums[k++] = nums[nums.length-1];
        return k;
    }
}