class Solution {
   public int[] twoSum(int[] nums, int target) {

        int[] sum = new int[2];

        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j - i] + nums[j] == target) {
                    sum[0] = j - i;
                    sum[1] = j;
                    return sum;
                }
            }
        }
        return sum;
    }
}