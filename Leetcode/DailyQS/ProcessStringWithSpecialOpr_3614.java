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

   

    public static void main(String[] args) {

        MediumLevelMethod();

    }

}
