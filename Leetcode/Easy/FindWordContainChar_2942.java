import java.util.List;
import java.util.ArrayList;

public class FindWordContainChar_2942 {

    static List<Integer> FindWordContainChar(String words[], char chr) {

        List<Integer> ls = new ArrayList<>();

        // -------------- Method 1 Bruteforce Approach but still it works in 2ms------

        // for (int i = 0; i < words.length; i++) {

        //     for (char ch : words[i].toCharArray()) {
        //         if (ch == chr) {
        //             ls.add(i);
        //             break;
        //         }
        //     }
        // }

         // Method 2 =============>>>>> optimized and Efficient Approach ------ 1ms
        // ------

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(chr) != -1) { // takes 1 ms run time
                // if(words[i].contains(String.valueOf(chr))){ // takes 2ms Run time
                ls.add(i);
            }
        }

        
        // Method 3 Using Stream API. It is Very Slow and Took 8 ms run time

        // List<Integer> ls = IntStream.range(0, words.length)
        // .filter(i -> words[i].indexOf(chr) != -1)
        // .boxed()
        // .collect(Collectors.toList());

        return ls;
    }

    public static void main(String[] args) {

        String words[] = { "leet", "code" };
        char chr = 'e';
        String words1[] = { "abc", "bcd", "aaaa", "cbc" };
        char chr1 = 'a';
        String words2[] = { "abc", "bcd", "aaaa", "cbc" };
        char chr2 = 'z';

        System.out.print(FindWordContainChar(words, chr));
        System.out.print(FindWordContainChar(words1, chr1));
        System.out.print(FindWordContainChar(words2, chr2));

        // for (int i = 0; i < str.length; i++) {
        // if(str[i].indexOf(ch) != -1){
        // System.out.println(i);
        // }
        // }
    }
}
