class Solution {
    public boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));  
    }

    private String buildString(String str){
        Stack<Character> stack = new Stack();
        for(char ch : str.toCharArray()){
            if(ch != '#'){
                stack.push(ch);
            }
            else if(!stack.isEmpty()){
                stack.pop();
            }
        }

        StringBuilder res = new StringBuilder();
        for(char c : stack){
            res.append(c);
        }
        return res.toString();
    }
}