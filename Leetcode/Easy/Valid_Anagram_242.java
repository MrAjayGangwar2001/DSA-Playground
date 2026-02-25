
import java.util.Arrays;

class Angrm {

    // Method 1 : Time Complexity O(n log n)
    public boolean Method_1() {

        // String s = "arc";
        // String t = "car";
        String s = "listen";
        String t = "silent";

        boolean Anagram = false;

        char a[] = s.toCharArray();
        char b[] = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (s.length() != t.length())
            return Anagram;

        if (Arrays.equals(a, b)) {

            Anagram = true;
            return Anagram;
        } else {
            return Anagram;
        }

    }
}

public class Valid_Anagram_242 {
    public static void main(String[] args) {
        Angrm ag = new Angrm();
        System.out.println(ag.Method_1());

    }
}