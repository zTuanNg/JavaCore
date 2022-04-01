package Ex1;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "Hello every one";
        countString(s);
    }

    public static void countString(String s){
        int cnt=0;
        List<Integer> lst_index = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            String c = String.valueOf(s.charAt(i));
            if(c.equals("e")){
                cnt ++;
                lst_index.add(i);
            }
        }
        System.out.printf("--So lan ky tu 'e' xuat hien: %d\n",cnt);
        System.out.println("--Index cua ky tu 'e' la: "+lst_index);

    }
}
