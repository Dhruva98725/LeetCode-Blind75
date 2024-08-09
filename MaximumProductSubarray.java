// Problem 152: Maximum Product Subarray
// Link: https://leetcode.com/problems/maximum-product-subarray/

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        double left = 0;
        double right = 0; 
        double ans = nums[0];

        for(int i = 0; i < n; i++){
            if(left == 0){
                left = 1;
            }
            if(right == 0){
                right = 1;
            }
            left = left * nums[i];
            right = right * nums[n - i - 1];
            ans = Math.max(ans, Math.max(left, right));
        }

        return (int)ans;
    }
}
