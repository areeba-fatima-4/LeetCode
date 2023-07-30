* It first compares the lengths of s and t. If they have different lengths, they cannot be anagrams, so it returns false.
​
* It then creates an integer array store of size 26, representing the 26 lowercase English letters. This array will keep track of the frequency of each letter in both s and t.
​
* The code iterates through the characters of both s and t simultaneously using a loop.
​
* For each character in s, it increments the count for that character in the store array.
​
* For each character in t, it decrements the count for that character in the store array.
​
* After the loops finish, if s and t are anagrams, all the counts in the store array should be 0. If any count is non-zero, it means that the frequencies of some characters in s and t differ, indicating that they are not anagrams.
​
* The method then checks the store array. If any element is non-zero, it returns false, indicating that s and t are not anagrams.
​
* If all elements in the store array are 0, it means s and t are anagrams, and the method returns true
​
**Note:**
​
In most programming languages, characters are internally represented as integers using their ASCII values. The ASCII value of 'a' is 97. So, the operation would be:
​
'a' - 'a' = 97 - 97 = 0
'z' - 'a' = 122 - 97 = 25