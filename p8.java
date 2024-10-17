import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        int[] ar = {1,2,3,9,5,6,6,9,5,8};
        int counter = 0;
        System.out.println("num to find : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]==n)
            {
                counter++;
            }
        }
        System.out.println("number of times "+n+" appears is "+counter);
    }
}