We can use a HashMap to store the frequency of each number in the input array nums.
​
While iterating through the input array, for each number n in the array, we will increment the count of n in the HashMap.
​
Whenever we find a new occurrence of a number, we have found a new pair.
​
Every new occurrence of a number can be paired with every previous occurrence of the same number. This means if a number has already appeared p times, we will have p-1 new pairs.
​
Hence, whenever we find a new occurrence of a number (that is, its count is more than 1), we will add p-1 to pairCount, which keeps track of the total number of good pairs.