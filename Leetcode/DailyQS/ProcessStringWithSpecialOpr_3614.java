package Leetcode.DailyQS;

public class ProcessStringWithSpecialOpr_3614 {

    // If the letter is a lowercase English letter append it to result.
    // A '*' removes the last character from result, if it exists.
    // A '#' duplicates the current result and appends it to itself.
    // A '%' reverses the current result.
    // Return the kth character of the final string res

    public static void MediumLevelMethod() {

        // String str = "a#b%*";
        // int k = 1;
        String str = "cd%#*#";
        int k = 3;

        String result = "";

        StringBuilder sb = new StringBuilder(result);

        for (char ch : str.toCharArray()) {

            switch (ch) {
                case '*':
                    sb.deleteCharAt(sb.length() - 1);
                    break;
                case '#':
                    sb.append(sb);
                    break;
                case '%':
                    sb.reverse();
                    break;
                default:
                    sb.append(ch);
                    break;
            }
        }

        if (sb.length() >= k) {

            char chr = sb.charAt(k);
            System.out.println(chr);
        } else {
            System.out.println("Character k is Out of bound of length result : " + k);
        }
    }

    public static char HardLevelMethod() {

        // String s = "cd%#*#";
        // long k = 3;

        String s = "a#b%*";
        long k = 1;

        long[] len = new long[s.length()];

        long currLen = 0;
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                currLen++;
            } else if (ch == '*') {
                if (currLen > 0) {
                    currLen--;
                }
            } else if (ch == '#') {
                // currLen *= 2;

                currLen = Math.min(currLen * 2, (long)1e18);
            }

            len[i] = currLen;
        }

        // k--;   if k indexing 1 based

        if (k >= currLen) {
            return '.';
        }

        for (int j = s.length() - 1; j >= 0; j--) {

            long prevLen = (j == 0) ? 0 : len[j - 1];

            char ch = s.charAt(j);

            if (ch >= 'a' && ch <= 'z') {

                if (k == prevLen) {
                    return ch;
                }
            } else if (ch == '#') {
                if(prevLen > 0){
                    k = k % prevLen;
                }
            } else if (ch == '%') {
                k = prevLen - 1 - k;
            } else if (ch == '*') {
                // k unchanged
            }

        }

        return '.';
    }

    public static void main(String[] args) {

        char ch = HardLevelMethod();
        MediumLevelMethod();

        System.out.println("Result : "+ch);
    }

}
