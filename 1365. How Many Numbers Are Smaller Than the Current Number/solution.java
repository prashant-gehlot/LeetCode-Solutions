class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size];
        int count = 0;
        
        for(int i =0; i < size; i++){
            for(int j =0; j < size; j++){
                if(j != i && nums[j]<nums[i]){
                    count++;
                }
            }
            ans[i] = count;
            count = 0;
        }
        return ans;
    }
}
