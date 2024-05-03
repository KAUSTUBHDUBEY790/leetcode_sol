public class Solution {
    public String reversePrefix(String word, char ch) {
        int chIndex = word.indexOf(ch);
        if (chIndex == -1) {
            return word;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            // Add characters through ch to the result in reverse order
            if (i <= chIndex) {
                result.append(word.charAt(chIndex - i));
            }
            // Add the rest of the characters to result
            else {
                result.append(word.charAt(i));
            }
        }

        return result.toString();
    }
}