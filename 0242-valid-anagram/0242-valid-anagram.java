class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> first = new HashMap<>();
        HashMap<Character, Integer> second= new HashMap<>();

        for(char i : s.toCharArray()) {
            first.put(i, first.getOrDefault(i, 0) + 1);
        }

        for(char i : t.toCharArray()) {
            second.put(i, second.getOrDefault(i, 0) + 1);
        }
        
        return first.equals(second);
    }
}