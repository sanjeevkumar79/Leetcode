class Solution {
    public int largestInteger(int num) {
        char[] digits=String.valueOf(num).toCharArray();
        
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for( char ch : digits){
            int digit = ch -'0';
            if(digit % 2==0){
                even.add(digit);
            }
            else{
                odd.add(digit);
            }
        }

        Collections.sort(odd,Collections.reverseOrder());
        Collections.sort(even,Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        int oddindex = 0, evenindex = 0;

        for(char ch : digits){
            int digit = ch -'0';
            if(digit % 2==0){
               result.append(even.get(evenindex++)); 
            }
            else{
                result.append(odd.get(oddindex++));
            }
        }
        return Integer.parseInt(result.toString());
    }
}