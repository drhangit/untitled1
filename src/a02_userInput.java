//Taking an integer from a user and
// print it out in the console
import java.util.Scanner;
public class a02_userInput {
    public static void main(String[] args) {
        //1. user input integer
        Scanner input = new Scanner(System.in);
        System.out.print("Number?: ");
        int num = input.nextInt();

        //2.print out the integer
        System.out.println(num);
    }
}

//documentation
//1. user input integer
//    a.import Scanner
//    b.Scanner object
//    c.var for the user input
//
//2.print out the integer