1768. Merge Strings Alternately
Solved
Easy
Topics
Companies
Hint
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

 

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
 

Constraints:

1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.

---------------------------------------------


class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len;
        String res = "";
        String[] arr1 = word1.split("");
        String[] arr2 = word2.split("");
        if(arr1.length > arr2.length)
            len = arr1.length;
        else
            len = arr2.length;

        for(int i=0; i< len; i++){
            if( i < arr1.length && i< arr2.length){
                res += arr1[i];
                res += arr2[i];
            }else if (i >= arr1.length && i< arr2.length){
                res += arr2[i];
            }else if (i < arr1.length && i >= arr2.length){
                res += arr1[i];
            }
        }
        return res;
    }
}

-----------------------------------------------------

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int len = Math.max(len1,len2);

        StringBuilder res = new StringBuilder(len1+len2);

        for(int i=0; i < len; i++){
            if(i < len1)
                res.append(word1.charAt(i));
            if(i < len2)
                res.append(word2.charAt(i));
        }
        return res.toString();
    }
}

---------------------------------------------------

int len1 = word1.length(), len2 = word2.length();
        int i = 0, j = 0;
        StringBuilder res = new StringBuilder(len1 + len2);

        // Merge until one string is exhausted
        while (i < len1 && j < len2) {
            res.append(word1.charAt(i++));
            res.append(word2.charAt(j++));
        }

        // Append remaining characters
        if (i < len1) res.append(word1.substring(i));
        if (j < len2) res.append(word2.substring(j));

        return res.toString();

