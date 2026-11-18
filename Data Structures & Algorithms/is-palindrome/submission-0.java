class Solution {
    public boolean isPalindrome(String s) {
        String stringWithoutWhiteSpace = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = stringWithoutWhiteSpace.length() - 1;
        while (i<j) {
            if (stringWithoutWhiteSpace.charAt(i) != stringWithoutWhiteSpace.charAt(j)) {
                return false;
            }

            i++;
            j--;
       }
       return true;
    }
}
