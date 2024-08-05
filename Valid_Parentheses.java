20. Valid Parentheses
Solved
Easy
Topics
Companies
Hint
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.

-----------------------------------------------------------
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='[')
                stk.push(c);
            else if(c==')' && !stk.isEmpty() && stk.peek()=='(')
                stk.pop();
            else if(c=='}' && !stk.isEmpty() && stk.peek()=='{')
                stk.pop();
            else if(c==']' && !stk.isEmpty() && stk.peek()=='[')
                stk.pop();
            else
                return false;
        }
        return stk.isEmpty();
        // Map <Character,Character> cmap=new HashMap<>();
        // cmap.put('(',')');
        // cmap.put('{','}');
        // cmap.put('[',']');
        // Stack <Character> stk=new Stack<>();
        // int i=0,j=1;
        
        // while(j<s.length()){
        //     char c=s.charAt(i);
        //     //System.out.println(s.charAt(j));
        //     if(cmap.containsKey(s.charAt(i))==false || s.charAt(j) != cmap.get(c))
        //         return false;
        //     i+=2;
        //     j+=2;
        // }
        // return true;
        
        
    }
}
