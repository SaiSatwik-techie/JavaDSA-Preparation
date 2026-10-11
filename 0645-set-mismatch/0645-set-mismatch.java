class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup=-1, missing=-1;
        HashSet<Integer> hs = new HashSet<>();
        for(int n:nums){
            if(hs.contains(n)){
                dup = n;
            }else{
            hs.add(n);
            }
            for(int i=1;i<=nums.length;i++){
                if(!hs.contains(i)){
                    missing = i;
                    break;
                }
            }

        }
        return new int[] {dup,missing};
       
    }
}