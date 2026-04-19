package Leetcode.Easy;

public class Final_Value_2011_Prblm {

    static int finalvalue(String[] operations){
        int value = 0;

        // Method 1 optimized
//        int len = operations.length;
//        for(int i = 0; i < len; i++){
//            String operator = operations[i];
//            String x = "X++";
//            String y = "++X";
//            if(operator.equalsIgnoreCase(x) || operator.equalsIgnoreCase(y)){
//                value++;
//            }else{
//                value--;
//            }
//        }

        // Method 2 more Optimized
        for (String op : operations) {
            if (op.charAt(1) == '+'){
                value++;
            }else{
                value--;
            }
        }
        return value;
    }

    static void main() {
        String [] operations = {"--X","X++","X++"};
        String [] operations1 = {"++X","++X","X++"};
        String [] operations2 = {"X++","++X","--X","X--"};
        System.out.println(finalvalue(operations));
        System.out.println(finalvalue(operations1));
        System.out.println(finalvalue(operations2));
    }
}
