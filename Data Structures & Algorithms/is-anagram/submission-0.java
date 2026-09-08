class Solution {
    public boolean isAnagram(String s, String t) {
        String newS = s.replaceAll("\\s+", "");
        String newT = t.replaceAll("\\s+", "");
        if (newS.length() != newT.length()) return false;

        HashMap<Character, Integer> firstHashMap = new HashMap();
        HashMap<Character, Integer> secondHashMap = new HashMap();

        for (int i=0; i<newS.length(); i++) {
            char sletter = newS.charAt(i);
            char tletter = newT.charAt(i);
            firstHashMap.put(sletter, firstHashMap.getOrDefault(sletter, 0)+1);
            secondHashMap.put(tletter, secondHashMap.getOrDefault(tletter, 0)+1);
        }
        return firstHashMap.equals(secondHashMap);
    }
}
