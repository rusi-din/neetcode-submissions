class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> set = new HashMap<>();

        for (String word : strs) {
            char[] charSet = word.toCharArray();
            Arrays.sort(charSet);
            String key = new String(charSet);

            if (!set.containsKey(key)) {
                ArrayList<String> listStr = new ArrayList<>();
                listStr.add(word);
                set.put(key, listStr);
            } else {
                ArrayList currentSet = (ArrayList<String>) set.get(key);
                currentSet.add(word);
                set.put(key, currentSet);
            }
        }
        return new ArrayList<>(set.values());
    }
}
