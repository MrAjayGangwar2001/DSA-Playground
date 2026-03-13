public class SubSequence {
    
    public static void FindSubSequence(String str, int i, String newStr){

        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }

        char curr = str.charAt(i);

        // If Add
        FindSubSequence(str, i+1, newStr+curr);


        // If Not Add
        FindSubSequence(str, i+1, newStr);
    }

    public static void main(String[] args) {
        String str = "abc";

        FindSubSequence(str, 0, "");
    }
}
