public class a06_for_random {
    public static void main(String[] args) {

        for (int i=0; i<20; i++){
            int rand = (int)(Math.random() * 50 + 1);
            System.out.println(rand);
//        double rand = Math.random() * 49 + 1;
        }



//        double[] arr= new double[20];
//        int min=2;
//        int max=5;
//
//        int a=1;
//        int b=5;
//        int i=0;
//        while( i <10){
//            double aa=Math.random();
//            System.out.println((int)(aa*b+1));
//            System.out.println((int)aa*b+1);
//            System.out.println("----------");
//            i++;
//        }
//
//
//        System.out.println((Math.random()*(max-min+1)+min));

//        for(int i=1;i<20;i++) {
//            System.out.println((int) ((Math.random() * (max - min + 1) + min)));
//        }
//        for(int i=1;i<20;i++) {
//            System.out.println((int)(Math.random()*(max-min+1)+min));
//        }
//        ;
//        Math.floor(Math.random()*(max-min+1)+min);
//        Math.floor(Math.random()*(max-min+1)+min);
//        Math.floor(Math.random()*(max-min+1)+min);
//        Math.floor(Math.random()*(max-min+1)+min);

//        for (int i=0; i<20; i++){
//            //random integer
//            int min = 1;
//            int max = 100;
//            double randN = Math.floor(Math.random()*(max-min+1)+min);
//
//            //--> array
//            arr[i] = randN;
//
//            // print out
//            System.out.println(arr[i]);
//        }
    }
}


//Create 20 random integers, store them in an array and
//print them out on the console window.
//for i=1~20
//    1. random integer
//            max=100, min=1
//            Math.floor(Math.random()*(max-min+1)+min);
//    2. --> array
//            int[] arr =
//    3. print them out
//            for 0 ~ 20-1
