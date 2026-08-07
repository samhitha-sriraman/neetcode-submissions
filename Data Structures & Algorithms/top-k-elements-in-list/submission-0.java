class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int [] res = new int[k];
        List<Integer> [] bucket = new List[nums.length+1];

         for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else {
            map.put(nums[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int keys=entry.getKey();
            int index= entry.getValue();
            bucket[index].add(keys);
        }


int val =0;
for(int i=bucket.length-1; i>0;i--)
{
    for(int n: bucket[i])
    {
        res[val] = n;
        val++;
           if (val == k) {
                    return res;
                }
    } 
    
     }
return res;  
    }
}
