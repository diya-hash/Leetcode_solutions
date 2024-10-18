class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        if(jewels.length() > stones.length()){
            for(int i=0; i<jewels.length(); i++){
                for(int j=0; j<stones.length(); j++){
                    if(jewels.charAt(i) == stones.charAt(j)) count++;
                }
            }
        } else {
            for(int i=0; i<stones.length(); i++){
                for(int j=0; j<jewels.length(); j++){
                    if(stones.charAt(i) == jewels.charAt(j)) count++;
                }
            }            
        }
        return count;       
    }
}