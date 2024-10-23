//Problem: https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/description/
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       		int arr[] = new int[200];
		int result [] = new int[2];
	    int j = 0;
		for(int i=0; i<nums.length; i++){
		    arr[nums[i]]++;
		    if(arr[nums[i]] == 2) { result[j] = nums[i]; j++; }
		}
        return result; 
    }
}