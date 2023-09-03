class Solution {
    public int mySqrt(int x) {
        
    if (x <=1 )
      return x;

    int left = 0;
    int right = x/2;
    int mid;
    long squared;

    while (left <= right) {
      mid = (left + right) / 2;
      squared = (long) mid * mid;
    
      if (squared== x) 
        return mid;

      else if (squared > x)
        right = mid - 1;

      else if (squared < x)
        left = mid +1;

    }
    
    return left - 1;

    }

}