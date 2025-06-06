class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)!='#'){
                stack1.push(s.charAt(i));
            }
            else{
                if(!stack1.isEmpty()){
                    stack1.pop();
                }
            }
        }
        for(int i = 0; i<t.length(); i++){
            if(t.charAt(i)!='#'){
                stack2.push(t.charAt(i));
            }
            else{
                if(!stack2.isEmpty()){
                    stack2.pop();
                }
            }
        }
        if(!stack1.equals(stack2))
            return false;
        return true;
    }
}


// class Solution {
//     public boolean backspaceCompare(String s, String t) {
//         return buildString(s).equals(buildString(t));  
//     }

//     private String buildString(String str){
//         Stack<Character> stack = new Stack();
//         for(char ch : str.toCharArray()){
//             if(ch != '#'){
//                 stack.push(ch);
//             }
//             else if(!stack.isEmpty()){
//                 stack.pop();
//             }
//         }

//         StringBuilder res = new StringBuilder();
//         for(char c : stack){
//             res.append(c);
//         }
//         return res.toString();
//     }
// }