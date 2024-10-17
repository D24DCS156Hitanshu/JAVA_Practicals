import java.util.Scanner;

public class p24
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        boolean validInput = false;


        while (!validInput)
        {
            try {
                System.out.print("Enter the first integer (x): ");
                x = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer for x.");
            }
        }

        validInput = false;


        while (!validInput) {
            try {
                System.out.print("Enter the second integer (y): ");
                y = Integer.parseInt(scanner.nextLine());
                validInput = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid input. Please enter a valid integer for y.");
            }
        }

        try
        {

            if (y == 0)
            {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            int result = x / y;
            System.out.println("Result of " + x + " / " + y + " is: " + result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}