class Solution {
    public int removeDuplicates(int[] arr) {
    int left = 0;
    int right = 1;

    while (right < arr.length) {

      if (arr[left] != arr[right]) {
        left++;
        arr[left] = arr[right];
      }
      right++;
    }

    return left + 1;
    }
}