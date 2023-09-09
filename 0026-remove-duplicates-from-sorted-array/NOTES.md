Initialize two pointers, slow and fast, both initially set to 0. These pointers will help you keep track of where you're storing the unique elements.
​
Start a loop with the fast pointer. Iterate through the array from the second element (index 1) to the end.
​
For each element at the fast pointer, compare it with the element at the slow pointer. If they are different, it means you've found a unique element. In this case, increment the slow pointer and copy the element from the fast pointer's position to the slow pointer's position.
​
Continue this process until you've processed all elements in the array.
​
After the loop ends, the slow pointer will be pointing to the last unique element, and all unique elements will be in the first part of the array. The elements after the slow pointer can be ignored because they are duplicates.
​
Return the value of slow + 1 as the length of the subarray with no duplicates