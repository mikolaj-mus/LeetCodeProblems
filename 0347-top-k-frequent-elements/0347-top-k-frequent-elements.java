class Solution {
    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] list = new List[nums.length + 1];
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }
        for (int key : map.keySet()) {
            list[map.get(key)].add(key);
        }

        List<Integer> res = new ArrayList<>();
        for (int i = list.length - 1; i >= 0; i--) {
                res.addAll(list[i]);
                if (res.size() >= k) break;
        }
        
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        
        return result;
    }
}