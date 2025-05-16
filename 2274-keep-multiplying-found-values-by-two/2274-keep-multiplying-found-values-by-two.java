class Solution {
    public int findFinalValue(int[] nums, int original) {
        //boolean found=true;
        //while(found){
          //  found=false;
        //     for(int num : nums){
        //         if(original==num){
        //             original*=2;
        //             found=true;
        //             break;
        //         }
        //     }
        // }
        // return original;

        Set<Integer> set= new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        while(set.contains(original)){
            original*=2;
        }
        return original;
    }
}