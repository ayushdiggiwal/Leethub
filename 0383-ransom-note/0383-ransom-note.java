public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || magazine == null) return false;

        int[] array1 = new int[26];
        int[] array2 = new int[26];

        for (char c : ransomNote.toCharArray()) {
            array1[c - 'a'] += 1;
        }

        for (char c : magazine.toCharArray()) {
            array2[c - 'a'] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if (array2[i] < array1[i]) {
                return false;
            }
        }

        return true;
    }
}