/**Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid. */

class Solution {
    public boolean isValid(String s) {
        
        HashMap<Character, Character> mp = new HashMap<>();
        mp.put('}','{');  mp.put(']','[');  mp.put(')','(');
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(mp.containsKey(s.charAt(i))){
                if(st.isEmpty()) return false;
                Character temp = st.pop();
                if(temp != mp.get(s.charAt(i))) return false;
            }
           else st.push(s.charAt(i));
        }
        return st.isEmpty();
        
    }
}