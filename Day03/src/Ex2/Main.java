package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        System.out.println("Input String is: " +s);

        // Check String
        boolean check = checkPalindrome(s);
        if(check)
            System.out.println("=>TRUE : This is is a Palindrome string.");
        else
            System.out.println("=>FALSE: This is not is a Palindrome string.");
    }

    public static boolean checkPalindrome(String s){
        int len = s.length();

        if(len %2 != 0)
            return false;
        else{
            for(int i=0; i<len/2;i++){
                String s1 = String.valueOf(s.charAt(i));
                String s2 = String.valueOf(s.charAt(s.length()-1-i));
                System.out.println("s1"+s1);
                System.out.println("s2"+s2);
                if(!s1.equals(s2))
                    return false;
            }
            return true;
        }
    }
}
