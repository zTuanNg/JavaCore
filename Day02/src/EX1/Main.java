package EX1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height: ");
        double height = sc.nextDouble();


        System.out.println("Enter width: ");
        double width = sc.nextDouble();

        System.out.println("Height = "+height);
        System.out.println("Width = "+width);

        System.out.println("=> Dien tich HCN: "+ (height*width));
        System.out.println("=> Chu vi HCN: "+(width+height)*2);
    }

}
