class Solution {
    public int[] twoSum(int[] nums, int target) {
         int n = nums.length;
        HashMap <Integer,Integer> map = new HashMap <>();

        for(int i = 0; i<n ; i++){
           int m = target - nums[i];
            if(!map.containsKey(m))map.put(nums[i],i);
            else{int a []= {map.get(m),i};
                 return a;
                }
        }
        
        return null;
    }
}
