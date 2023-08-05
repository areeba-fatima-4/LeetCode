1. Create an array store of size 26 to count the occurrences of each alphabet character.

2. Iterate through each character in the sentence.

3. For each character, if it's an uppercase alphabet, increment the count for its lowercase counterpart in the store array.

4. If the character is a lowercase alphabet, increment the count for itself in the store array.

5. After iterating through all characters, check if any count in the store array is zero or negative. If so, return false, indicating not a pangram.

6. If all counts in the store array are positive (greater than zero), return true, indicating a pangram.
