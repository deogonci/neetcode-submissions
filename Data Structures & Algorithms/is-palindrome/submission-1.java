class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]","");
        cleaned = cleaned.toLowerCase();

        char[] reverse = cleaned.toCharArray();
        String reversed = "";

        for (int i = reverse.length-1; i >= 0; i--) {
            reversed += reverse[i];
        }

        if (reversed.equals(cleaned)) {
            return true;
        }

        return false;
    }
}
