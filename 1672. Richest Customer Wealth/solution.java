class Solution {
    public int maximumWealth(int[][] accounts) {
        // person = row
        // account = col

        int maxSum = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length ; person++) {
            // when you start a new col, take a new sum fot that row
            int rowSum = 0;
            for (int account = 0; account < accounts[person].length ; account++) {
                rowSum = rowSum + accounts[person][account];
            }
            if (rowSum > maxSum) {
                maxSum = rowSum;
            }
        }
        return maxSum;
    }
}
