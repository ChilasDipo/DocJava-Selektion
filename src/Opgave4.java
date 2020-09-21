public class Opgave4 {
    public static void main(String[] args) {
        int x = 34;
        int y = 35;
        int z = 35;

        if (y == x & y == z) {
            System.out.println("tallene har sammen værdi");
        } else if (y > x & y > z) {
            System.out.println("Den største værdi er " + y);
        } else if (x > y & x > z) {
            System.out.println("Den største værdi er " + x);
        } else if (z > y & z > x) {
            System.out.println("Den største værdi er" + z);
        } else if (z == x & z > y)  {
            System.out.println("2 vædier er ens og den største værdi er " + z);
        }else if (y == x & y > z) {
            System.out.println("2 vædier er ens og den største værdi er " + y);
        }else if (z == y & z > x) {
            System.out.println("2 vædier er ens og den største værdi er " + z);
        }else {
            System.out.println("Critical fail");
        }


    }
    public static int funktion (int x, int y , int z){
        int temp = -1;
        if (y == x & y == z) {
             temp = 1 ;
        } else if (y > x & y > z) {
             temp = 2;
        } else if (x > y & x > z) {
             temp = 3 ;
        } else if (z > y & z > x) {
             temp = 4 ;
        } else if (z == x & z > y)  {
             temp = 5 ;
        }else if (y == x & y > z) {
             temp = 6 ;
        }else if (z == y & z > x) {
             temp = 7 ;
        }else {
             temp = 8 ;
        }
        return  temp ;
    }

}
