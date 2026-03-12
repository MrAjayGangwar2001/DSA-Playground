public class LetterMove {

    public static void moveX(String str, int i, int count, String result){
        if (i == str.length()) {
            for (int j = 0; j <= count; j++) {
                result += 'x';
            }
            System.out.println("Updated Values : "+result);
            return;
        }
        char curr = str.charAt(i);
        if (curr == 'x') {
            count++;
            moveX(str, i+1, count, result);
        } else {
            result += curr;
            moveX(str, i+1, count, result);
        }
    }
    public static void main(String[] args) {
        String str = "axbxcxxd";
        moveX(str, 0, 0, "");
    }
}
