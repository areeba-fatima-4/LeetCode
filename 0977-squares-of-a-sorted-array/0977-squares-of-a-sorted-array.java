class Solution {
    public int[] sortedSquares(int[] arr) {
    int[] squares = new int[arr.length];
    int right = arr.length - 1;
    int left = 0;
    int index = arr.length - 1;
    int leftSquared;
    int rightSquared;

    while (left <= right) {
      leftSquared = arr[left] * arr[left];
      rightSquared = arr[right] * arr[right];

      if (leftSquared > rightSquared) {
        left++;
        squares[index] = leftSquared;
      } else {
        // rightSquared >= leftSquared
        right--;
        squares[index] = rightSquared;
      }
      index--;
    }
    return squares;
    }
}