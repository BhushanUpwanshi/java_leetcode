136. Single Number
Solved
Easy
Topics
Companies
Hint
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.

---------------------------------


class Solution {
    public int singleNumber(int[] nums) {
        Map <Integer,Integer> m=new HashMap<>();
        for(int i: nums){
            if(m.containsKey(i)){
                m.put(i,m.get(i)+1);
            }else{
                m.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> e: m.entrySet()){
            if(e.getValue()==1){
                return e.getKey();
            }
        }

        return 0;
    }
}
---------------------------------

