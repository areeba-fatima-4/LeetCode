class Solution {
    public String reverseVowels(String s) {
        
  int left = 0;
  int right = s.length() -1;
  String vowels = "AEIOUaeiou";

  char[] chars = s.toCharArray();

while (left < right) {
  while (left < right && vowels.indexOf(chars[left]) == -1) {
    left++;
  }

   while (left < right && vowels.indexOf(chars[right]) == -1 ) {
    right--;
  }

  char temp = chars[left];
  chars[left] = chars[right];
  chars[right]= temp;

  left++;
  right--;
  }

  return new String(chars);
    }
}