class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        List<Character> sChars = new ArrayList<>();
        List<Character> tChars = new ArrayList<>();

        for (char character : s.toCharArray()) {
            sChars.add(character);
        }

        for (char character : t.toCharArray()) {
            tChars.add(character);
        }

        for (char character : sChars) {
            if (tChars.contains(character)) {
                tChars.remove(Character.valueOf(character));
            } else {
                return false;
            }
        }

        if (tChars.size() != 0) {
            return false;
        }

        return true;
    }
}
