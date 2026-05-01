class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleanedStringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);

            if (Character.isLetterOrDigit(character)) {
                cleanedStringBuilder.append(Character.toLowerCase(character));
            }
        }

        String cleanedString = cleanedStringBuilder.toString();
        String reversedCleanedString = cleanedStringBuilder.reverse().toString();

        return cleanedString.equals(reversedCleanedString);
    }
}
