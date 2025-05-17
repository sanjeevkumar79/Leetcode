class Solution {
    public List<Integer> intersection(int[][] nums) {
     Map<Integer,Integer> freqmap= new HashMap<>();
     int totalarr=nums.length;

     for(int[] arr: nums){
        Set<Integer> unique= new HashSet<>();
        for(int num : arr){
            unique.add(num);
        }
        for(int num : unique){
            freqmap.put(num,freqmap.getOrDefault(num,0)+1);
        }
     }
     List<Integer> result= new ArrayList<>();
     for (Map.Entry<Integer, Integer> entry : freqmap.entrySet()) {
        if(entry.getValue() == totalarr) {
            result.add(entry.getKey());
            }
        }
        Collections.sort(result);
        return result;
    }
}
