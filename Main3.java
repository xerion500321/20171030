import java.util.Scanner;
public class Main3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        char ch = scn.next().charAt(0);
        for (int i = 1; i <= a; i++) {
            for (int y = 1; y <= a; y++) {
                System.out.print(ch);
            } System.out.println();
        }

    }
}