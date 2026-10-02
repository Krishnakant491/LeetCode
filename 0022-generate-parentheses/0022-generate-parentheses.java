class Solution {
    List<String> res;
    public void solve(int left , int right , StringBuilder curr){
        if(left == 0 && right == 0){
            res.add(new String(curr));
        }
        if(left > 0){
            curr.append('(');
            solve(left - 1 , right , curr);
            curr.deleteCharAt(curr.length() - 1);
        }
        if( right > 0 && right > left){
            curr.append(')');
            solve(left, right - 1, curr);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        solve(n,n,new StringBuilder());
        return res;
    }
}