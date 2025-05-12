class Solution {
    public boolean hasAllCodes(String s, int k) {
        int total = 1<<k;
        HashSet<String> seen = new HashSet<>();

        for(int i=0;i<=s.length()-k;i++){
            String sub=s.substring(i,i+k);
            seen.add(sub);
        }
       if(seen.size()==total)
          return true;
        return false; 
    }
}