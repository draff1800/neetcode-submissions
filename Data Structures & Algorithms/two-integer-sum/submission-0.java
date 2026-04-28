class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                int tempSum = nums[i] + nums[j];
                if (tempSum == target) {
                    index1 = i;
                    index2 = j;
                }
            }
        }

        int[] answer = new int[]{index1, index2};
        Arrays.sort(answer);
        return answer;
    }
}
