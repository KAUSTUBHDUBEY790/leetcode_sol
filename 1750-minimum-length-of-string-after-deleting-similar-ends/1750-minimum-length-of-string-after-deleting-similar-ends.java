public class Solution {
    public int minimumLength(String s) {
        int begin = 0;
        int end = s.length() - 1;

        while (begin < end && s.charAt(begin) == s.charAt(end)) {
            char c = s.charAt(begin);

            while (begin <= end && s.charAt(begin) == c) {
                begin++;
            }

            while (end > begin && s.charAt(end) == c) {
                end--;
            }
        }

        return end - begin + 1;
    }
}