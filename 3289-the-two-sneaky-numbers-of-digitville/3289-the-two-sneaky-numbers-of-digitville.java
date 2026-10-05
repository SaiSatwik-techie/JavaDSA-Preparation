class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        int arr[] = new int[2];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(hash.contains(nums[i])){
                arr[j++] = nums[i];
            }else{
                hash.add(nums[i]);
            }
        }
        return arr;
    }
}