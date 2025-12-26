class Solution {
    public int longestConsecutive(int[] nums) {
        int longestlen = 0;
        Map<Integer, Boolean> longestmap = new HashMap<>();
        for(int num : nums){
            longestmap.put(num, Boolean.FALSE);
        }

        for(int num : nums){
            int currlen = 1;

            int nextnum = num + 1;
            while(longestmap.containsKey(nextnum) && longestmap.get(nextnum) == false){
                currlen++;
                longestmap.put(nextnum, Boolean.TRUE);
                nextnum++;
            }

            int prevnum = num - 1;
            while(longestmap.containsKey(prevnum) && !longestmap.get(prevnum)){
                currlen++;
                longestmap.put(prevnum, Boolean.TRUE);
                prevnum--;
            }
           longestlen = Math.max(longestlen, currlen);
        }
        return longestlen;
    }
}