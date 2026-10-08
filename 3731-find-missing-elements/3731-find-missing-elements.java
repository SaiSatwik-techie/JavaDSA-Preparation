class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> li = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<>();
        int min = nums[0];
        int max = nums[0];
        for(int i=0; i<nums.length;i++){
            set.add(nums[i]);
            if(nums[i]<min){
                min = nums[i];
            }
            if(nums[i]>max){
                max = nums[i];
            }
        }

        for(int j=min;j<max;j++){
            if(!set.contains(j)){
                li.add(j);
            }
        }
        return li;
    }
}