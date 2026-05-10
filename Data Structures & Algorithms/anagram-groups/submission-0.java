class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs) {

            int[] freq = new int[26];

            // Count frequency
            for(char ch : str.toCharArray()) {
                freq[ch - 'a']++;
            }

            // Build unique key
            StringBuilder key = new StringBuilder();

            for(int count : freq) {
                key.append(count).append("#");
            }

            // Add into hashmap
            map.putIfAbsent(key.toString(), new ArrayList<>());

            map.get(key.toString()).add(str);
        }

        return new ArrayList<>(map.values());
        
    }
}
