/*
1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                arr[count]=i;
                count++;
                arr[count]=j;
                count++;
                return arr;
                }
            }
        }
     return arr;
    }
}


//----------------------------------------------------------------------------------------

class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            return new int[] {map.get(nums[i]),i};
        }
        else{
            map.put(target-nums[i],i);
        }
      }
      return new int[] {0,0};
    }
}
