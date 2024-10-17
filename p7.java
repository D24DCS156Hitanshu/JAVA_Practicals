
import java.util.Scanner;

class test5 {
    public static void main(String[] args) {
        String a = "Chocolate";
        String b = "ABCDEF";
        int n = 0;
        System.out.println("Enter numbers of times you want to print :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(a.substring(0, 3));
           
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
        System.out.print(b.substring(0, 3));
        }
        


    }
}