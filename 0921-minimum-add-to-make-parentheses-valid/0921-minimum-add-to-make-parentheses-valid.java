class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('c');
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    c++;
                }
            }
        }
        
        return c+st.size();
    }
}