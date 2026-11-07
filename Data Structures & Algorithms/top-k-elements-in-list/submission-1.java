class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] frequent = new int[k];

        for (int num : nums) {
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        for (int i = 0; i < k; i++) {
            int freq = 0;
            int high = 0;
            
            for (int num : map.keySet()) {
                int count = map.get(num);

                if (count > high) {
                    high = count;
                    freq = num;
                }
            }

            frequent[i] = freq;
            map.remove(freq);
        }
        return frequent;
    }
}
