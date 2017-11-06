import java.util.Scanner;
public class Main5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        for (int i=1 ; i<=a ; i++ ){
            for(int y=1 ; y<=a ; y++){
                System.out.print(i*y+"\t");
            }System.out.println();
        }
    }
}