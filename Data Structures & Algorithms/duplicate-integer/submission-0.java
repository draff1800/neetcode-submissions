class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> numberFrequencyStore = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numberFrequencyStore.containsKey(nums[i])) {
                return true;
            } else {
                numberFrequencyStore.put(nums[i], 1);
            }
        }

        return false;
    }
}