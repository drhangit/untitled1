import java.util.Random;
public class rand {
    public static void main(String[] args) {
        Random rand = new Random();          //object (instance)
        //variable
        char C1='A';
        char C2='c';
        for(int i=1; i<11; i++){
//            int n = rand.nextInt(11);   // [0 ~ 100]
//            double n = rand.nextDouble(); // [0.0 ~ 1.0]
            char n=(char)(C1 + Math.random()*(C2-C1+1));
            System.out.println(n);
        }
    }


}
