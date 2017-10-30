import java.util.Scanner;
public class Main3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if (a <= 12 && a >= 1) {
            if (a <= 5 && a >= 3) {
                System.out.println("Spring");
            } else if (a <= 8 && a >= 6) {
                System.out.println("Summer");
            } else if (a <= 11 && a >= 9) {
                System.out.println("Autumn");
            } else {
                System.out.println("Winter");
            }
        }
    }
}