class Solution {
    public int largestAltitude(int[] gain) {
        
        int size = gain.length;
        int[] alts = new int[size+1];
        alts[0] = 0; alts[1] = gain[0];
        for( int i=2; i<size; i++){
            alts[i] = gain[i-2]+ gain[i-1];
        }
        int max=0;
        for(int i=0; i<size; i++){
            if(alts[i]>max){
                max = alts[i];
            }
        }
        return max;
    }
}
