package Ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Đếm số từ trong chuỗi
        String s = "You only live once, but if you do it right, once is enough";
        countWord(s);

        // Đếm và in ra index của các ký tự o
        countLetter(s);
    }

    //Đếm số từ trong chuỗi
    public static void countWord(String s){
        String[] arr = s.split(" ");
        System.out.printf("--So tu trong chuoi la: %d\n",arr.length);
    }

    //
    public static void countLetter(String s){
        int cnt=0;
        List<Integer> lst_index = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            String c = String.valueOf(s.charAt(i));
            if(c.equals("o")){
                cnt ++;
                lst_index.add(i);
            }
        }
        System.out.printf("--So lan ky tu 'o' xuat hien: %d\n",cnt);
        System.out.println("--Index cua ky tu 'o' la: "+lst_index);
    }
}
