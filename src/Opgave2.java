public class Opgave2 {
    public static void main(String[] args) {
        int x = 41;
        int y = 67;

        boolean a = x + y > 100;

        if (a == true) {
            System.out.println("Summen er større end hundrede");
        } else if (x + y == 100)   {
            System.out.println("Summen er lig 100");
        }
        else{
            System.out.println("Summen er mindre end hundrede");
        }
    }
}