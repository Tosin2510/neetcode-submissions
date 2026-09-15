class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        if (s == null || s.isEmpty()) {
            return 0;
        }
        for (int i=0; i< s.length() - 1; i++) {
            int result = Math.abs(s.charAt(i+1) - s.charAt(i));
            score += result;
        }
        System.out.println("Output" + score);
        return score;
    }
}