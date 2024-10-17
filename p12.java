import java.util.Scanner;

class test2 {
    public static void main(String[] args) {

        int a;
        System.out.println("Enter value in pounds: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Value in Rupees :  " + a * 100);

    }
}