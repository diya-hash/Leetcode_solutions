class Solution {
    public int finalValueAfterOperations(String[] operations) {
		int x = 0;
		for(String i : operations){
		    if(i.equals("--X")) x = x-1;
		    if(i.equals("X--")) x = x-1;
		    if(i.equals("X++")) x = x+1;
		    if(i.equals("++X")) x = x+1;
		}
		return x;      
    }
}