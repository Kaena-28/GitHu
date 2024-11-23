import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /*Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
       int b = scanner.nextInt();
       int m;
       if (a > b) {
           m = 100;
       } else {
           m = 50;
       }
        System.out.println(m);*/

        Random random = new Random();
        int a1 = random.nextInt(100);
        int b1 = random.nextInt(100);
        int c = a1+b1;
        System.out.println(c);
    }
}
