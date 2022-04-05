import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex6 {
    public static void main(String[] args) {

        checkEmail();


    }

    public static void checkEmail(){
        String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";

        Scanner sc = new Scanner(System.in);
        System.out.println("Input your email: ");
        String email = sc.nextLine();

        boolean check = Pattern.matches(EMAIL_PATTERN,email);
        if (check)
            System.out.println("=>Valid email");
        else
            System.out.println("=>Invalid email");
    }


}
