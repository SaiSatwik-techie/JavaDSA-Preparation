class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while(n!=1 && !hs.contains(n)){
            hs.add(n);
            int temp=0, res=0, rem=0;
            temp = n;
            while(temp>0){
                rem = temp%10;
                res+= rem*rem;
                temp /= 10;
            }
            n = res;
        }
        return n==1;
    }
}