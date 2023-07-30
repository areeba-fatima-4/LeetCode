class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Keys: element of nums, Values: Corresponding indexes
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0 ; i < nums.length; i++) {
            
            var x = nums[i];
            var expected = target - x;
            
            // check if 'x' was once an 'expected' of some element 
            if (map.containsKey(x))
                return new int[]{map.get(x),i};
            
            map.put(expected, i);
        }
        
        return new int[1];
    }
}


