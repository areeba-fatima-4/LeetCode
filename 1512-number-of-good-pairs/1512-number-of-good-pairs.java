class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pairCount = 0;
        int previous;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            previous = map.getOrDefault(nums[i], 0);
            map.put(nums[i], previous+1);
            pairCount += map.get(nums[i]) - 1; //pairCount+=previous 
        }
        return pairCount;
    }
}