class Solution {
    public boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() -1;

    char[] chars = s.toCharArray();

    while (left < right) {
        while (left < right && !(Character.isDigit(chars[left]) ||                  Character.isLetter(chars[left]))) {
           left++;
      }

       while (left < right && !(Character.isDigit(chars[right]) ||          Character.isLetter(chars[right])) ) {
        right--;
      }

      if (Character.toLowerCase(chars[left]) == Character.toLowerCase(chars[right])) {
        left++;
        right--;
      } else
          return false;
 
  }
    return true; 
  }
    
}