package EX1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println("a + b = "+(a+b));
        System.out.println("a - b = "+(a-b));
        System.out.println("b - a = "+(b-a));
        System.out.println("a * b = "+(a*b));
        System.out.println("a / b = "+(a/b));
        System.out.println("b / a = "+(b/a));
    }
}
