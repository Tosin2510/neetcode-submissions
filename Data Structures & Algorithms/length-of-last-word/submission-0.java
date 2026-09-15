class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        int lengthLastWord = words[words.length -1 ].length();
        System.out.println("Output:" + lengthLastWord);
        return lengthLastWord;
    }
}