class Solution {
    public boolean containsDuplicate(int[] nums) {
        
            List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
    Set<Integer> set = new HashSet<Integer>(list);
 
    return nums.length != set.size();
    
            
    }
}