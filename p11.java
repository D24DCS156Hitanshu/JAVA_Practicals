
import java.util.Scanner;

class test {
    public static void main(String[] args) {
        String a = "CHARUSAT UNIVERSITY";
        System.out.println(a);
        System.out.println("Length : "+ a.length());
        System.out.println("Enter first letter of your name");
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        System.out.println("Replace H with "+b+"  : "+a.replaceFirst("H", b));

    }
}