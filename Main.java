import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        System.out.print("請輸入:"  );
         int a = scn.nextInt();
	     int b = scn.nextInt();
         int san=0;
         for(int i=a; i<=b ;i++){
         san = san + i;
         }
        System.out.println(san);
    }
}
