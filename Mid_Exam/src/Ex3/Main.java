package Ex3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int rd_number = randomNumber(100); // limit random number < 100
        System.out.printf("Random number is: %d\n",rd_number);
        boolean check = isPrimeNumber(rd_number);
        if(check)
            System.out.println("==> Random number is Prime number");
        else
            System.out.println("==> Random number is not Prime number");

    }

    // check Prime number
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Random number
    public static int randomNumber(int upperBound){
        Random rd = new Random();
        int rdNumber = rd.nextInt(upperBound);
        return rdNumber;
    }
}
