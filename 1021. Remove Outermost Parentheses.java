class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int opencount = 0;
        for(char ch:s.toCharArray()){
            if(ch == '('){
                if(opencount>0) res.append(ch);
                opencount++;
            }
            else{
                opencount--;
                if(opencount>0) res.append(ch);
            }
        }
        return res.toString();
    }
}
