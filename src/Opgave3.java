public class Opgave3 {
    public static void main(String[] args) {
        int x = 34;
        int y = 35;

        if (y == x) {
            System.out.println("tallene har sammen værdi");
        } else if (y > x) {
            System.out.println("Den største værdi er " + y);
        } else if (x > y) {
            System.out.println("Den største værdi er " + x);
        } else {
            System.out.println("Critical fail");
        }

    }
}