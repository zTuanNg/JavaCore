package Ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>();
        int cnt = 0;
        int i = 2;

        while(cnt < 10){
            if(isPrimeNumber(i)){
                lst.add(i);
                cnt++;
            }
            i++;
        }

        // Liệt kê 10 số nguyên tố đầu tiên
        System.out.println("--10 so nguyen to dau tien la: "+lst);

        // Liệt kê các số nguyên tố nhỏ hơn 10
        System.out.print("--So nguyen to nho hon 10 la: ");
        for(int j : lst){
            if (j < 10) {
                System.out.print(j+"   ");
            }
        }

    }

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
}
