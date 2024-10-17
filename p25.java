import java.util.Scanner;

public class p25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter the index to access in the array (0-3): ");
            int index = scanner.nextInt();
            int[] array = {1, 2, 3, 4};
            System.out.println("Accessing element at index " + index + ": " + array[index]);

            
            System.out.print("Enter a string: ");
            scanner.nextLine(); 
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                str = null;
            }
            System.out.println("Length of the string: " + str.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught " );
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught " );
        } 

        scanner.close();
    }
}
