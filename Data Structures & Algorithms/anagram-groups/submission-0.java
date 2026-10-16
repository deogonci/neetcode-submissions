class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> group = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String key = new String(letters);

            if (!group.containsKey(key)) {
                group.put(key, new ArrayList<>());
            }

            group.get(key).add(word);
        }

        return new ArrayList<>(group.values());
    }
}
