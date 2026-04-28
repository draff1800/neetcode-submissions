class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        const numberFrequencyMap = new Map();

        nums.forEach((number) => {
            const count = numberFrequencyMap.get(number) || 0;
            numberFrequencyMap.set(number, count + 1);
        });

        const mostFrequentNumbers = [...numberFrequencyMap.entries()]
            .sort((a, b) => b[1] - a[1])
            .slice(0, k)
            .map(([num]) => num); // if you want just the numbers, not [num, freq] pairs

        return mostFrequentNumbers;
    }
}