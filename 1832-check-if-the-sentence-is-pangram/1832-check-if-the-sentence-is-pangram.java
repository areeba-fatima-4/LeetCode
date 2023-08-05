class Solution {
    public boolean checkIfPangram(String sentence) {
    int[] store = new int[26];


    for (int i = 0; i < sentence.length(); i++) {
      if (Character.isUpperCase(sentence.charAt(i)))
        store[sentence.charAt(i) - 'A']++;
      else if (Character.isLowerCase(sentence.charAt(i)))
        store[sentence.charAt(i) - 'a']++;
    }

    for (int s: store) {
      if (s <= 0)
        return false;
    }

    return true;
    }
}