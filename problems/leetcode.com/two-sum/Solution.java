class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        if (length > 2) {
            for (int i = 0; i < length; i++) {
                for (int j = 1; j < length; j++) {
                    if (i != j && nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[] { 0, 1 };
    }
}