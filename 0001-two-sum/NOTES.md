* The twoSum method takes an array of integers nums and an integer target as input.
* It aims to find a pair of numbers in the nums array whose sum equals the target.
* It uses a HashMap to efficiently store the elements of the array and their corresponding expected pair indices as it traverses the array.
* For each element x in the array, it calculates the expected value that, when added to x, would give the target.
* If the HashMap already contains x, it means the pair (x, expected) has been found, and it returns the indices of both elements.
* If x is not found in the HashMap, it means the expected complement has not been encountered yet, so it stores the expected value and its index in the HashMap.
* If no valid pair is found after traversing the whole array, it returns an array of length 1 to indicate no such pair exists.


Approach 2

----------------------------------------------------------------------------------------------------------------------------

    public static int[] search(int[] arr, int targetSum) {
    // TODO: Write your code here

    int left = 0;
    int right = arr.length -1;
    int sum = 0;

    while (left < right) {
      sum = arr[left] + arr[right] ;

      if (sum == targetSum)
        return new int[] {left, right};

      if (sum > targetSum)
        right--;

      else if (sum < targetSum)
        left++;

    }

    return new int[] { -1, -1 };
  }


  To solve this problem, we can consider each element one by one (pointed out by the first pointer) and iterate through the remaining elements (pointed out by the second pointer) to find a pair with the given sum. The time complexity of this algorithm will be  where ‘N’ is the number of elements in the input array.

Given that the input array is sorted, an efficient way would be to start with one pointer in the beginning and another pointer at the end. At every step, we will see if the numbers pointed by the two pointers add up to the target sum. If they do not, we will do one of two things:

If the sum of the two numbers pointed by the two pointers is greater than the target sum, this means that we need a pair with a smaller sum. So, to try more pairs, we can decrement the end-pointer.
If the sum of the two numbers pointed by the two pointers is smaller than the target sum, this means that we need a pair with a larger sum. So, to try more pairs, we can increment the start-pointer.
