class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        int[] indexArray = new int[2];

        for (i=0; i<nums.length; i++) {
            for (j=0; j<nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        indexArray[0] = i;
                        indexArray[1] = j;
                    }
                }
            }
        }
        Arrays.sort(indexArray);
        return indexArray;
    }
}
