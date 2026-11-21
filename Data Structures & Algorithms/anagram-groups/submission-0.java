class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> hashMap = new HashMap<>();

        for (String string: strs) {
            char[] characters = string.toCharArray();
            Arrays.sort(characters);
            String sortedKey = new String(characters);
            if (!hashMap.containsKey(sortedKey)) {
                hashMap.put(sortedKey, new ArrayList<>());
            }

            hashMap.get(sortedKey).add(string);
        }

        return new ArrayList<>(hashMap.values());
    
    }

    
}
