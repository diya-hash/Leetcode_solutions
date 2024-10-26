class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] left = new int[nums.length];
        int [] right = new int[nums.length];
        int result [] = new int [nums.length];
        int sum = 0;
        
        for(int i=0; i<nums.length; i++){
            if(i>0){
                sum += nums[i-1];
            }
            left[i] = sum;
            System.out.println(left[i]);
        }
        sum = 0;
        for(int i=0; i<nums.length; i++) sum += nums[i];
        // System.out.println(sum); 
        for(int i=0; i<nums.length; i++){  
            sum -= nums[i];
            right[i] = sum;
            // System.out.println(right[i]);
        }
        for(int i=0; i<nums.length; i++){
            result[i] = Math.abs(left[i] - right[i]);
            // System.out.println(result[i]);
        }       
        return result;
    }
}