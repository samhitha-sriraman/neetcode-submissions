class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int curr = 1;
        int longest = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                // duplicate: ignore it
                continue;
            }

            if (nums[i + 1] == nums[i] + 1) {
                curr++;
            } else {
                // sequence broke
                curr = 1;
            }

            longest = Math.max(longest, curr);
        }

        return longest;
    }
}