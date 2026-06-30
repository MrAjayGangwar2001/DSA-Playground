package Leetcode.DailyQS;

public class NoOfStringContainAllSubstring_1358 {

    public static void main(String[] args) {

        String str = "aaacb";
        // String str = "abcabc";

        int Result = CountNoOfSubstring(str);

        System.out.println(Result);

    }

    private static int CountNoOfSubstring(String str) {

        int len = str.length();

    //  Basic Bruteforce Approach but return TLE Error with O(n^2/ n^3)
    /*
         * int count = 0;
         * for (int i = 0; i < str.length(); i++) {
         * 
         * StringBuilder sb = new StringBuilder();
         * for (int j = i; j < str.length(); j++) {
         * 
         * sb.append(str.charAt(j));
         * 
         * String x = "a";
         * String y = "b";
         * String z = "c";
         * 
         * if (sb.toString().contains(x) && sb.toString().contains(y) &&
         * sb.toString().contains(z)) {
         * count++;
         * 
         * }
         * }
         * 
         * }
         */

        int count = 0;
        for (int i = 0; i < len; i++) {

            boolean hasA = false;
            boolean hasB = false;
            boolean hasC = false;
            for (int j = i; j < len; j++) {

                char ch = str.charAt(j);

                if (ch == 'a')
                    hasA = true;
                else if (ch == 'b')
                    hasB = true;
                else if (ch == 'c')
                    hasC = true;

                if (hasA && hasB && hasC) {
                    count += len - j;
                    break;
                }
            }
        }

        return count;

    }
}
