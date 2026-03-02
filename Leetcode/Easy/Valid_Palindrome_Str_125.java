
class Palindrome{

    public boolean Method_1(){
        // String s = "race a car";
        // String s = "A man, a plan, a canal: Panama";
        // String s = "Marge, let's \"[went].\" I await {news} telegram.";
        
        // String s = "Was it\\ a rat I saw?";
        String s = "`l;`` 1o1 ??;l`";

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
}


public class Valid_Palindrome_Str_125{
    public static void main(String args[]){
        
        Palindrome p = new Palindrome();

        System.out.println(p.Method_1());
    }
}