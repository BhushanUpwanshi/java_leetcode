14. Longest Common Prefix
Solved
Easy
Topics
Companies
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

  --------------------------

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res=strs[0];
        char[] ch=strs[0].toCharArray();
        for(int i=1;i<strs.length;i++){
            String temp="";
            char[] ch2=strs[i].toCharArray();
            for(int j=0;j<Math.min(ch.length,ch2.length);j++){
                if(ch[j]==ch2[j]){
                    temp+=ch[j];
                }
                else
                    break;
            }
            res= (Math.min(res.length(),temp.length())==res.length())? res:temp;
        }
        return res;
    }
}

----------------------------------------

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        for(int i=0 ; i<strs[0].length();i++){
            for(int j=0;j<n;j++){
                if(strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i))
                    return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }
}
---------------------------------

  
