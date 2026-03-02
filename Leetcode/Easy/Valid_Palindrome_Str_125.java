
class Palindrome{

    public boolean check(){
        // String s = "race a car";
        String s = "A man, a plan, a canal: Panama";

        String clean = s.replaceAll("[!@#$%^&*()_:,.<>?/\\|\"{}']", "").toLowerCase();
        String str = clean.replaceAll(" ", "");
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();

        // System.out.println(str);
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

        System.out.println(p.check());
    }
}