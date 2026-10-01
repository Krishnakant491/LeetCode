class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        Map<Character, Character> braceMap = new HashMap<>();
        braceMap.put('(', ')');
        braceMap.put('{', '}');
        braceMap.put('[', ']');

        for(Character ch : s.toCharArray()){
            if(braceMap.containsKey(ch)){
                st.push(ch);
            }
            else if(st.isEmpty() || ch != braceMap.get(st.pop())){
                return false;
            }
        }
        return st.isEmpty();
        
    }
}