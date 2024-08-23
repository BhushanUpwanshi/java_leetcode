5. Longest Palindromic Substring
Solved
Medium
Topics
Companies
Hint
Given a string s, return the longest 
palindromic
 
substring
 in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.
--------------------------------------------

class Solution {
    public static boolean isPal(String s1){
        int start=0;
        int end=s1.length()-1;
        while(start <= end){
            if(s1.charAt(start++)!=s1.charAt(end--))
                return false;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String longPal="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    String sub=s.substring(i,j+1);
                    if(isPal(sub))
                        longPal = (Math.max(longPal.length(),sub.length())==longPal.length())?longPal:sub;
                }
            }
        }
        return longPal;
    }
}
--------------------------------------------------
