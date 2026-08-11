class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)
        z=[]
        for i in range(n):
            val = target - nums[i]
            for j in range(i+1,n):
                if(nums[j]==val):
                    z.append(i)
                    z.append(j)
        return z 
            
        