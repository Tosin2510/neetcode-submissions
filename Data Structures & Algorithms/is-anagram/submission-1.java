class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> firstHashMap = new HashMap<>();
        HashMap<Character, Integer> secondHashMap = new HashMap<>();

        for (int i=0; i < s.length(); i++) {
            firstHashMap.put(s.charAt(i), firstHashMap.getOrDefault(s.charAt(i), 0)+ 1);
        }

        for (int j=0; j < t.length(); j++) {
            secondHashMap.put(t.charAt(j), secondHashMap.getOrDefault(t.charAt(j), 0)+ 1);
        }

        return firstHashMap.equals(secondHashMap);
    }
}
