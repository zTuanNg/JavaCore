package Ex2;

public class Main {
    public static void main(String[] args) {
        boolean check = checkPalindrome("acbbca");
        System.out.println(check);
    }

    public static boolean checkPalindrome(String s){
        int len = s.length();


        if(len %2 != 0)
            return false;

        else{
            for(int i=0; i<len;i++){
                String s1 = String.valueOf(s.charAt(i));
                String s2 = String.valueOf(s.charAt(s.length()-1-i));
                if(!s1.equals(s2))
                    return false;
            }
            return true;
        }
    }
}
