
import java.util.HashSet;
import java.util.Set;


public class CountTheNumberOfConsistentString_1684 {

    static int CountConsistent(String allowed, String[] words) {

        int count = 0;

        Set<Character> st = new HashSet<>();

        for(char ch : allowed.toCharArray()){
        st.add(ch);
        }

        for(int i = 0; i < words.length; i++){

        int len = words[i].length();

        boolean contain = true;

        for(int j = 0; j < len; j++){

        if(!st.contains(words[i].charAt(j))){
        contain = false;
        break;
        }
        }

        if(contain){
        count++;
        }
        }


        return count;
    }

    public static void main(String[] args) {

        // String[] words = {"a","b","c","ab","ac","bc","abc"}; // 7
        // String allowed = "abc";

        String[] words = { "ad", "bd", "aaab", "baa", "badab" }; // 2
        String allowed = "ab";

        int result = CountConsistent(allowed, words);

        System.out.println(result);
    }
}