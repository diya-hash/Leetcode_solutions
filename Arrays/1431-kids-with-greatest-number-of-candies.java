class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = -1;
		List<Boolean> result = new ArrayList<Boolean>();
		
		for(int i=0; i<candies.length; i++)
		    if(candies[i] > max) max = candies[i];
		
	    for(int i=0; i<candies.length; i++){
	        if(extraCandies + candies[i] >= max) result.add(true);
	        else result.add(false);
	    }
		return result;       
    }
}