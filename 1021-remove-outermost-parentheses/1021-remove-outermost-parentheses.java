class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character>st=new Stack<>();
        StringBuffer sb=new StringBuffer();
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(!st.isEmpty()) sb.append(ch);
            st.push(ch);
            }else{
                st.pop();
                if(!st.isEmpty()){
                    sb.append(ch);
                }
            }
        }
        // for(int i=0;i<c;i++){
        //     sb.append("()");
        // }
        return sb.toString();
    }
}