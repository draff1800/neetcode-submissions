class Solution {
    public boolean isPalindrome(String s) {
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while (leftPointer < rightPointer) {
            while (leftPointer < rightPointer && !Character.isLetterOrDigit(s.charAt(leftPointer))) {
                leftPointer++;
            }

            while (leftPointer < rightPointer && !Character.isLetterOrDigit(s.charAt(rightPointer))) {
                rightPointer--;
            }

            char leftCharacter = Character.toLowerCase(s.charAt(leftPointer));
            char rightCharacter = Character.toLowerCase(s.charAt(rightPointer));

            if (leftCharacter != rightCharacter) {
                return false;
            }

            leftPointer++;
            rightPointer--;
        }

        return true;
    }
}
