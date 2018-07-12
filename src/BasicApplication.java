import java.util.Scanner;

public class BasicApplication {

    /*Your 6 year old client needs an application
    that will receive an integer from the user banging on
    the keyboard, add 5 to it, double it, subtract 7 from it,
    and display the result to the screen.
     */

    public static void main (String [] args) {

        Scanner keyboard = new Scanner(System.in);

        int num;

        System.out.print("Enter a number: " );
        num= keyboard.nextInt();
        System.out.print((num + 5)*2-7);

        keyboard.close();


    }

}
