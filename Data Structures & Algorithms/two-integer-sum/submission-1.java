public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap < Integer, Integer> place = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            if (place.containsKey(needed)) {
                return new int[] {place.get(needed),i};
            }

            place.put(nums[i], i);
        }
        return new int[2];
    }
}