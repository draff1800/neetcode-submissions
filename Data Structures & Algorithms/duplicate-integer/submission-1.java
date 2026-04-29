class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numberFrequencyStore = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numberFrequencyStore.contains(nums[i])) {
                return true;
            } else {
                numberFrequencyStore.add(nums[i]);
            }
        }

        return false;
    }
}