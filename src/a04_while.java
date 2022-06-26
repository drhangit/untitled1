public class a04_while {
    public static void main(String[] args) {
//        //1.user input principal
//        Scanner input = new Scanner(System.in);
//        System.out.print("Principal?: ");
//        int prncpl = input.nextInt();
//    }
        //2.calculate
        int prncpl = 100;//test
        double bal = prncpl;
        int month = 0;
        while (bal < prncpl * 2) {
            bal = bal*(1 + 0.1);
            month++;
            System.out.println(month);
            System.out.println(bal);

        }

        System.out.printf("It takes %d months.", month);
    }
}



//until bal=principal x 2
//        100
//     1   100+100*0.06 -->bal
//     2   bal+bal*0.06 -->bal
//     3   bal+bal*0.06
//     n   bal = 100 x 2
//3.print out months
//    }
//}
//How long does it take in month when the user input principal($) becomes double
//if you get 6% interest for your current balance?
//principal? 100
//It takes ** months to become a double

//1.user input principal
//until bal=principal x 2
//    2.calculate
//        100
//     1   100+100*0.06 -->bal
//     2   bal+bal*0.06 -->bal
//     3   bal+bal*0.06
//     n   bal = 100 x 2
//3.print out months