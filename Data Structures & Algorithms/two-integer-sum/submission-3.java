class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int tempSum = nums[i] + nums[j];
                if (tempSum == target) {
                    int[] answer = new int[]{i, j};
                    Arrays.sort(answer);
                    return answer;
                }
            }
        }
        return new int[]{0,0};
    }
}
