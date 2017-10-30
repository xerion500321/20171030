import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
     int a = scn.nextInt();
     int b = scn.nextInt();
     if(Math.pow(a,2)+Math.pow(b,2)<=10000){
         System.out.println("inside");
     }
    else{
         System.out.println("outside");
     }
    }
}
