import java.util.Scanner;
public class Opgave4UI {
    public static void main(String[] args) {
        Scanner inputx = new Scanner(System.in);
        Scanner inputy = new Scanner(System.in);
        Scanner inputz = new Scanner(System.in);
        System.out.println("input");
        int x = Integer.parseInt(inputx.next());
        System.out.println("input");
        int y = Integer.parseInt(inputy.next());
        System.out.println("input");
        int z = Integer.parseInt(inputz.next());
        int temp = Opgave4.funktion(x,y,z);
        if (     temp == 1 ) {
            System.out.println("tallene har sammen værdi");
        } else if (temp == 2) {
            System.out.println("Den største værdi er " + y);
        } else if (temp == 3) {
            System.out.println("Den største værdi er " + x);
        } else if (temp == 4) {
            System.out.println("Den største værdi er " + z);
        } else if (temp == 5)  {
            System.out.println("2 vædier er ens og den største værdi er " + z);
        }else if (temp == 6) {
            System.out.println("2 vædier er ens og den største værdi er " + y);
        }else if (temp == 7) {
            System.out.println("2 vædier er ens og den største værdi er " + z);
        }else if (temp == 8 ) {
            System.out.println("Critical fail");
        }
    }
}