// Remove Duplicate From a Given String by Using Recursion
public class RemoveDuplicate {
    public static boolean []map = new boolean[26];

    public static void DuplicateHtao(String str, int i, String newStr){

        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }
        char curr =  str.charAt(i);
        if (map[curr - 'a']) {
            DuplicateHtao(str, i+1, newStr);
        } else {
            newStr += curr;
            map[curr - 'a'] = true;
            DuplicateHtao(str, i+1, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "abbabbacddcd";
        DuplicateHtao(str, 0, "");
    }
}
