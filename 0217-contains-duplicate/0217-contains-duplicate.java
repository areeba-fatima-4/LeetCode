class Solution {
    public boolean containsDuplicate(int[] nums) {
    
        HashSet hset = new HashSet<Integer>();
        
        for (int n : nums) {
            if (hset.contains(n))
                return true;
            else
                hset.add(n);
        }
           
        return false;
    }
}