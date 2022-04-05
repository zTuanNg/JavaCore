package Ex5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("===Mang so 1===");
        int[][] arr = inputArr();

        // Print Array
        System.out.println("--Mang da nhap la: ");
        printArray(arr);

        // Print duong cheo chinh
        System.out.print("--Phan tu tren duong cheo chinh la: ");
        for(int i = 0; i < arr.length;i++){
            for(int j = 0 ; j <arr[0].length;j++){
                if(i == j){
                    System.out.print(arr[i][j]+"  ");
                }
            }
            }
        System.out.println();

        // Tạo thêm 1 mảng hai chiều có cùng số dòng và số cột thực hiện cộng hai mảng với nhau
        System.out.println("===Mang so 2===");
        int[][] createArr = createArr(arr.length,arr[0].length);

             // Print Array
        System.out.println("--Mang da tao la: ");
        printArray(createArr);

            // Sum 2 array
        int[][] sum_arr = sumArray(arr,createArr);
        System.out.println("--Tong 2 array la: ");
        printArray(sum_arr);
    }

    public static int[][] inputArr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang: ");
        int n = sc.nextInt();
        System.out.println("Nhap so cot: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                System.out.printf("Phan tu arr[%d][%d]: ",i,j);
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static int[][] createArr(int n, int m){
        int[][] arr = new int[n][m];
        Random rand = new Random();

        for(int i = 0;i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                arr[i][j] = rand.nextInt(20);

            }

        }

        return arr;
    }

    public static int[][] sumArray(int[][] arr1, int[][] arr2){
        int[][] arr = new int[arr1.length][arr1[0].length];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                arr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr){
        for(int i = 0; i < arr.length;i++){
            for(int j = 0 ; j <arr[0].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
