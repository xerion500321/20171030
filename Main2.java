import java.util.Scanner;
public class Main2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
                System.out.println("Bissextile Year");
            } else {
                System.out.println("Common Year");
            }
        }
    }
