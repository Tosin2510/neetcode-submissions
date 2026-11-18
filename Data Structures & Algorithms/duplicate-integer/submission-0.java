class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int val = 0; val < nums.length - 1; val++) {
            if (nums[val] == nums[val + 1]) {
                return true;
            }
        }
        return false;
    }
}