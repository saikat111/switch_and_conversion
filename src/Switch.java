import  java.util.Scanner;
public class Switch {
    public static void main(String args[]){
        int number ;
        Scanner takeInput = new Scanner(System.in);
        number = takeInput.nextInt();
        switch(number)
        {
            case 10:
                System.out.println(10);
                break;
            case 15:
                System.out.println(15);
                break;
            case 20:
                System.out.println(20);
                break;
            case 21:
                System.out.println(21);
                break;
            default:
                System.out.println("1 time not found, Try againg for 2nd time ");
                switch (number){
                    case 22 :
                        System.out.println(22);
                        break;
                    default:
                        System.out.println("2nd time  not found");
                }

        }
    }
}
/*
* If the character is A, E, I, O, or U, it is vowel otherwise consonant. It is not case-sensitive.
* A - vowel
* a - vowel
* */


/*
* if(){
* }
* if :
*
* */