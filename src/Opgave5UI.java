import java.util.Scanner;
public class Opgave5UI {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("input");
        int x = Integer.parseInt(u.next());
        int y = Opgave5.funktion1(x) ;
        System.out.println( "intervallet er " + "["+ y + "0"  + " : " + y+9 +"]" );
    }
}
