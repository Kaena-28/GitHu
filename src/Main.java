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
        System.out.println(m);

        Random random = new Random();
        int a1 = random.nextInt(100);
        int b1 = random.nextInt(100);
        int c = a1+b1;
        System.out.println(c);

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        zvezda(a);
    }
    public static void zvezda(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(a+b);

        int a = 100;
        int b = 200;
        int c = a+b;
        int d = c/2;
        System.out.println(d);*/

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        sum(a , b);
    }
    public static void sum(int a, int b) {
        int c = a+b;
        int d = c/2;
        System.out.println(d);
    }
}
