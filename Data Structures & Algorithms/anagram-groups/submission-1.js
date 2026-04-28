class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        const anagramMap = {};

        strs.forEach((string) => {
            const sortedWord = string.split('').sort().join('');

            if (!anagramMap[sortedWord]) {
                anagramMap[sortedWord] = []
            }

            anagramMap[sortedWord].push(string);
        });

        return Object.values(anagramMap);
    }
}
