class Solution {
    public int findNumbers(int[] nums) {
        int evencount=0;
        for(int i : nums){
            String str=String.valueOf(i);
            int digitcount = str.length();

            if(digitcount % 2==0){
                evencount++;
            }
        }
        return evencount;
        
    }
}