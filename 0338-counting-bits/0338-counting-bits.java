class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            int bit= i & 1;
            ans[i]= ans[i>>1] + bit;
        }
        return ans;
        
    }
}