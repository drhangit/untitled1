import java.util.Scanner;
public class a03_while {
    public static void main(String[] args) {
        //1.user input: double
        Scanner input = new Scanner(System.in);
        System.out.print("Number?: ");
        double num = input.nextDouble();

        //input varification
        while (num != -1){
            System.out.println(num);
            System.out.print("Number?: ");
            num = input.nextDouble();
        }

        //done
        System.out.println("done!");
    }
}


//take a user decimal (float/double)number and
//print it out until a user enters -1

//1.user input: double //3 3 -1
//while input !=-1
//    2.print it out
//    user input
//print "done"