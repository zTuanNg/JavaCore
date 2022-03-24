package Array_Ex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ex1

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String str = sc.nextLine();

        String new_str = processString(str);

        System.out.println("String after processing: "+new_str);


        // Ex2

        int[] arr = processArray();

        System.out.print("Array after processing: ");
        for(int i : arr){
            System.out.print(i + "\t");
        }

        sc.close();
    }

    public static String processString(String s){

        String[] arr = s.split(" ");
        s = "";
        for(String i : arr){
            if(i != " "){
                s += i.substring(0,1).toUpperCase() + i.substring(1).toLowerCase();
                s += " ";
            }

        }

        return s;
    }

    public static int[] processArray(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Array's value: ");
        for(int i = 0; i< arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Input Array: ");
        for(int i:arr){
            System.out.print(i+"\t");
        }
        System.out.println();

        for(int i = 0; i< arr.length; i++){
            if(arr[i]%2 == 0){
                arr[i] += 1;
            }
        }

        sc.close();

        return arr;

    }
}
