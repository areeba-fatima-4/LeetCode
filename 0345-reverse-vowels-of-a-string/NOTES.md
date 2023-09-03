We first create a static string "vowels" that contains all lowercase and uppercase vowels. This is used for checking whether a character in the input string is a vowel.
​
The reverseVowels method accepts a string 's' as an argument. The first and last pointers are initialized to the start and end of the string, respectively.
​
We convert the input string 's' to a character array 'array' to allow easy manipulation of individual characters.
​
We enter a while loop that continues until 'first' is less than 'last'.
​
Inside the while loop, we have two nested while loops:
​
The first nested while loop keeps incrementing the 'first' pointer until it points to a vowel or 'first' is no longer less than 'last'.
​
The second nested while loop keeps decrementing the 'last' pointer until it points to a vowel or 'last' is no longer greater than 'first'.
​
Once we've found a vowel at both the 'first' and 'last' pointers, we swap these vowels.
​
After the swap, we increment the 'first' pointer and decrement the 'last' pointer, and continue to the next iteration of the outer while loop.
​
After exiting the while loop, we convert the character array back to a string and return it as the result.
​
​