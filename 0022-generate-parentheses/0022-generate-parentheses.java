class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        backtrack(res,"",0,0,n);
        return res;
    }
    void backtrack(List<String> lst,String cur,int op,int cl,int mx){
        if(cur.length()==mx*2){
            lst.add(cur);
            return;
        }
        if(op<mx){
            backtrack(lst,cur+"(",op+1,cl,mx);
        }
        if(cl<op){
            backtrack(lst,cur+")",op,cl+1,mx);
        }
    }
}