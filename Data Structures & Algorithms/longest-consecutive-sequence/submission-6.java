class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        int curr=1;
        int longest =1;
        if (nums.length == 0) return 0;
        for(int i=0;i<nums.length-1;i++)
        {

            if (nums[i + 1] == nums[i]) {
                // duplicate: ignore it
                continue;
            }
            if(nums[i+1]==nums[i]+1)
            {
               curr++; 
               System.out.print(curr);
            }

            else {
                curr = 1;
            }

        longest = Math.max(longest, curr);


            

        }
        return longest;

        
    }
}
