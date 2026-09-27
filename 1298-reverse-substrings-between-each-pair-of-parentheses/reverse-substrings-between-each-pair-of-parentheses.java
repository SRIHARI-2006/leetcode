class Solution {
    public String reverseParentheses(String s) {
        StringBuilder result = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == ')') {
                int openIdx = result.lastIndexOf("(");
                
                StringBuilder temp = new StringBuilder(result.substring(openIdx + 1)).reverse();
                result.replace(openIdx, result.length(), temp.toString());
            } else {
                
                result.append(c);
            }
        }
        
        return result.toString();
    }
}