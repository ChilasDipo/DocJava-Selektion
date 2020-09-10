public class Opgave1 {
    public static void  main(String[] args){
        int x = 5;
        int y = 8;
        int z = 3;

        //ogpave A

        boolean a = x <= 5 || x == y && z == 3;

        System.out.println("A: ");
        System.out.println(a);

        //opgave B

        boolean a1 = (x == 5) || (x == y) && z == 3;


        System.out.println("B: ");
        System.out.println(a1);

        //opgave C
        boolean a2 = x/y > z/x;

        System.out.println("C: ");
        System.out.println(a2);

        //opgave D

        boolean a3 = !(x != y - z) == false;


        System.out.println("D: ");
        System.out.println(a3);

        //opgave E

        boolean a4 = 2 * x != x || x == 0 ;

        System.out.println("E: ");
        System.out.println(a4);


        //opgave E

        boolean a5 = !true || !false ;

        System.out.println("F: ");
        System.out.println(a5);

    }
}
