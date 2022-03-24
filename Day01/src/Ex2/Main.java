package Ex2;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        int z = 5;

        int b = a++;
        System.out.println(b); // b = 5
        System.out.println(a); // a = 6
        // => a++ : gán giá trị cho b rồi giá trị a tăng lên 1 đơn vị

        int c = ++z;
        System.out.println(c); // c = 6
        System.out.println(z); // z = 6
        // => z tăng gia tri lên 1 đơn vị rồi gán giá trị cho c
    }
}
