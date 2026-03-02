
class Palindrome{

    // String s = "race a car";
    // String s = "A man, a plan, a canal: Panama";
    // String s = "Marge, let's \"[went].\" I await {news} telegram.";
    
    // String s = "Was it\\ a rat I saw?";
    String s = "`l;`` 1o1 ??;l`";

    // Method 1 takes time : O(n) and space O(n) and allso slower
    public boolean Method_1(){

        // String clean = s.replaceAll("[\\\\`!@#$%^&*()_:,;.<>?/\\|\"{}'--+=\\[\\]]", "").toLowerCase();
        String clean = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String str = clean.replaceAll(" ", "");
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();

        System.out.println(str);
        // System.out.println(rev);

        if (str.equals(rev)) {
            return true;
        }else{
            return false;
        }

    }

    // Method 2 :- Time O(n) and Space O(1)
    public boolean Method_2(){

        int left = 0;
        int right = (s.length()) -1;

        while (left < right) {
            
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}


public class Valid_Palindrome_Str_125{
    public static void main(String args[]){
        
        Palindrome p = new Palindrome();

        // System.out.println(p.Method_1());
        System.out.println(p.Method_2());
    }
}