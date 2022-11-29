class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        
        List<Integer> ans = new ArrayList<>();
        
        int left = 0; int right = n-1;
        int top = 0; int bottom = m-1;
        
        while(m*n > ans.size()){
            for(int i = left; i <= right; i++){
                ans.add(matrix[top][i]);
            }
            
            for(int i = top+1; i <= bottom; i++){
                ans.add(matrix[i][right]);
            }
            
            if(top != bottom){
                for(int i = right-1; i >= left; i--){
                ans.add(matrix[bottom][i]);
                }
            }
            
            if(left != right){
                for(int i = bottom-1; i > top; i--){
                ans.add(matrix[i][left]);
                }
            }
            top++; bottom--; left++; right--;
        }
        return ans;
    }
}
