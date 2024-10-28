//problem link: https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
class Solution {
    public int countKDifference(int[] nums, int k) {
		int count = 0;
		for(int i=0; i<nums.length-1; i++){
		    for(int j=i+1; j<nums.length; j++){
		        if(Math.abs(nums[i] - nums[j]) == k){
		            System.out.println(nums[i] +"," + nums[j] + ":");
		            System.out.println(nums[i] - nums[j]);
		            count++;
		        } 
		    }
		}
		return count;
	}       
}