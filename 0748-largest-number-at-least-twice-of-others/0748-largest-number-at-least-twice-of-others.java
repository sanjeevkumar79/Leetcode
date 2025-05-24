class Solution {
    public int dominantIndex(int[] nums) {
        if(nums==null || nums.length<0) return -1;
        int max=-1;
        int secondmax=-1;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                secondmax=max;
                max=nums[i];
                index=i;
            }
            else if(nums[i]>secondmax){
                secondmax=nums[i];
            }
        }
        if(max>=2*secondmax){
            return index;
        }
        else{
            return -1;
        }
    }
}