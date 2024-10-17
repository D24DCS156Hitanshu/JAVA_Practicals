import java.util.*;

class test1 {
    public static void main(String[] args) {
        int i ; int j ;
        System.out.println("Enter String :");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] arr = a.toCharArray();
        for ( i = 0; i < arr.length; i++) {
            int count = 1;
            for ( j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("Char '" + arr[i] + "' repeated times: " + count);
            }

        }
    }
}