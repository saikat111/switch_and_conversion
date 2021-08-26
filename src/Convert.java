public class Convert {
    public static void main(String args[]){
        String number = "1971";
        String number2 = "29";
        int result ; /*???*/
       /*int a;
       int b;
       a = Integer.valueOf(number);
       b = Integer.valueOf(number2);
       result = a + b;
       System.out.println(result);*/
        result = Integer.valueOf(number) + Integer.valueOf(number2);
        System.out.println(result);
/*
        System.out.println(Integer.valueOf(number) + Integer.valueOf(number2));
*/

    }
}
