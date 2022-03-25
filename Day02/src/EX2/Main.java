package EX2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your sex: ");
        String sex = sc.nextLine();

        System.out.println("Enter your address: ");
        String address = sc.nextLine();

        System.out.printf("Hello, I'm %s, i'm %s. Now i'm %d years old and i live in %s.", name, sex, age, address);

    }
}
