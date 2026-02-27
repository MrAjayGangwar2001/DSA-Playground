
import java.util.Arrays;
import java.util.HashMap;

class Angrm {

    String s = "listen";
    String t = "silent";

    // Method 1 : Time Complexity O(n log n) & space O(n )
    public boolean Method_1() {

        // String s = "arc";
        // String t = "car";

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


    // Method : 2 by using HashMap

    public boolean Method_2(){

        if(s.length() != t.length()) return  false;

        HashMap<Character, Integer> ls =  new HashMap<>();

        for(char x : s.toCharArray()){
            ls.put(x, ls.getOrDefault(x, 0) +1);

        }

        for (char y : t.toCharArray()) {
            
            if (!ls.containsKey(y) || ls.get(y) == 0) {
                return false;
            }

            ls.put(y, ls.get(y) - 1);
        }

        return true;
    }
}

public class Valid_Anagram_242 {
    public static void main(String[] args) {
        Angrm ag = new Angrm();
        // System.out.println(ag.Method_1());
        System.out.println(ag.Method_2());

    }
}