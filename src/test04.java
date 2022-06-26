public class test04 {
    public static void main(String[] args) {
        System.out.println(Math.random());
        double r=Math.random();
        System.out.println(r);
        double r2=r*5;
        System.out.println(r2);
        System.out.println(r2+1);
        int a=1;
        int b=10;
        for(int i=1;i<10;i++){
            int res= a + (int)(Math.random()* b+1);
            System.out.println(res);
        }
    }
}

