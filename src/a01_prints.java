import java.util.Date;
public class a01_prints {
          public static void main(String[] args) {
//              System.out.printf(21);
              System.out.printf("%d %t  b",21);
              System.out.printf("Name: %s %n  Age: %d", "John", 21);
              System.out.println("Name: John \nAge: 21");
             System.out.print("Hello");
             System.out.print("World!");

             System.out.println("Hello");
             System.out.println("World!");

             System.out.println("21" + 10);
             System.out.println(21 + 10);

            System.out.printf("%d %n",123);
            System.out.printf("%s%n","John");
            System.out.printf("%S%n","John");
            System.out.printf("%f %n",12345.678);
            System.out.printf("%.1f %n",12345.678);
            System.out.printf("%.2f %n",12345.678);
            System.out.printf("%.3f %n",12345.678);
            System.out.printf("%.4f %n",12345.678);
            System.out.printf("%.5f %n",12345.678);

            System.out.printf("%5.2f %n",12345.678);
            System.out.printf("%8.2f %n",12345.678);
            System.out.printf("%9.2f %n",12345.678);
            System.out.printf("%10.2f %n",12345.678);
            System.out.printf("%15.2f %n",12345.678);
            System.out.printf("%20.2f %n",12345.678);

              System.out.printf("'%3.2f'%n", 3.1423);
              System.out.printf("'%3.2e'%n", 3.1423);

            System.out.printf("Name: %s %n  Age: %d", "John", 21);
              System.out.print("Name: John \n Age" + 21);

            // System.out.printf("%,d %n", 12300);
              System.out.printf("I am %s and %d years of age.%n", "John", 21);
              System.out.println("I am" + "John" + " and " + 21 + " \t years of age.");
              System.out.println("I am" + "John" + " and " + 21 + " \tyears of age.");
              System.out.print("Name: John \n Age" + 21);

            Date date = new Date();
            System.out.printf("%tT%n", date);

            System.out.printf("hours: %tH%n minutes: %tM%n seconds: %tS%n", date, date, date);

            System.out.printf("%1$td-%1$tm-%1$ty %n", date);
            System.out.printf("%1$tA, %1$tB %1$tY %n", date);
            // display time and date using toString()
            System.out.println(date.toString());





        }
    }

