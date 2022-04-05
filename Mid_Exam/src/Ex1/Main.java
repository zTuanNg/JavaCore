package Ex1;

public class Main {
    public static void main(String[] args) {
        // Hình hình vuông *
        System.out.println("--Hình hình vuông *");
        printHinhVuong();

        // Hình tam giác *
        System.out.println("--Hình tam giác *");
        printTamGiac();

    }

    public static void printHinhVuong(){
        for(int i =0; i<4; i++){
            for(int j=0; j<4;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void printTamGiac(){
        for(int i =0; i<4; i++){
            for(int j=0; j<4;j++){
                if(i>=j)
                    System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
